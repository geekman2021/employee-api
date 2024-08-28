package com.arkeup.employee_api.services.repository;

import com.arkeup.employee_api.data.domain.object.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsername(String name);
    public Boolean existsByUsername(String name);
    public Boolean existsByEmail(String email);
}
