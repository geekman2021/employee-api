package com.arkeup.employee_api.security.jwt;

import com.arkeup.employee_api.security.UserDetailsImpl;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.security.Key;
@Component
public class JwtUtils {
    private static final Logger logger= LoggerFactory.getLogger(JwtUtils.class);

    @Value("${employee.app.jwtSecret}")
    private String jwtSecret;

    @Value("${employee.app.jwtExpirationMs}")
    private int jwtExpiration;

    public String generateJwtToken(Authentication authentication) {
        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

        return Jwts.builder().setSubject((userPrincipal.getUsername())).
                setIssuedAt(new Date()).
                setExpiration((new Date((new Date().getTime()) +  jwtExpiration ) )).
                signWith(key(), SignatureAlgorithm.HS256).compact();
    }
    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }
    public String getUsernameFromJwtToken(String token) {
        return Jwts.parserBuilder().setSigningKey(key()).build().parseClaimsJwt(token).getBody().getSubject();
    }

    public boolean validateJwtToken (String authToken) {
        try {
            Jwts.parserBuilder().setSigningKey(key()).build().parse(authToken);
            return  true;
        } catch (MalformedJwtException e) {
            logger.error("Invalid jwtToken " + e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("token expired" + e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported" + e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }

        return false;
    }

}
