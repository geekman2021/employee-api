package com.arkeup.employee_api.services.repository;

import com.arkeup.employee_api.data.domain.object.ERole;
import com.arkeup.employee_api.data.domain.object.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    public Optional<Role> findByName(ERole name);
}
