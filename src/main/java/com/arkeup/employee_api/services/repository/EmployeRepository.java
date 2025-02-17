package com.arkeup.employee_api.services.repository;

import com.arkeup.employee_api.data.domain.object.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employee, Integer> {

}
