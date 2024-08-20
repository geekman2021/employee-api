package com.arkeup.employee_api.services.repository;

import com.arkeup.employee_api.data.domain.object.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUserName(String name);
    public Boolean existByUserName(String name);
    public Boolean existByEmail(String email);
}
