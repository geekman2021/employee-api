package com.arkeup.employee_api.services.metier;

import com.arkeup.employee_api.data.domain.object.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeSM {
    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Optional<Employee> deleteEmployee(Integer id);
    public Employee findEmployeeById(Integer id);
    public List<Employee> findAllEmployee();
}
