package com.arkeup.employee_api.services.applicatif;

import com.arkeup.employee_api.data.domain.object.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeSA {

    public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Optional<Employee> removeEmployee(Integer id);
    public Employee getEmployeeById(Integer id);
    public List<Employee> getAllEmployees();
}
