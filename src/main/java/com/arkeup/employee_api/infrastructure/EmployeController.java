package com.arkeup.employee_api.infrastructure;

import com.arkeup.employee_api.data.domain.object.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.arkeup.employee_api.services.applicatif.EmployeeSA;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeController {
    @Autowired
    private final  EmployeeSA employeeSA;

    public EmployeController(EmployeeSA employeeSA) {
        this.employeeSA = employeeSA;
    }

    @GetMapping("/api/employee")
    public List<Employee> getAllEmployees() {
        return employeeSA.getAllEmployees();
    }
    @GetMapping("/api/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeSA.getEmployeeById(id);
    }

    @PostMapping("/api/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeSA.createEmployee(employee);
    }

    @PutMapping("/api/employee")
    public Employee updateEmployee(Employee employee) {
        return employeeSA.updateEmployee(employee);
    }

    @DeleteMapping("/api/employee/{id}")
    public Optional<Employee>  removeEmployee(@PathVariable Integer id) {
        return employeeSA.removeEmployee(id);
    }

}
