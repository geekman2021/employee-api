package com.arkeup.employee_api.infrastructure;

import com.arkeup.employee_api.data.domain.object.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arkeup.employee_api.services.applicatif.EmployeeSA;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "employee")
public class EmployeController {
    @Autowired
    private final  EmployeeSA employeeSA;

    public EmployeController(EmployeeSA employeeSA) {
        this.employeeSA = employeeSA;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeSA.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeSA.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeSA.createEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeSA.updateEmployee(employee);
    }
    @DeleteMapping("/{id}")
    public Optional<Employee>  removeEmployee(@PathVariable Integer id) {
        return employeeSA.removeEmployee(id);
    }

}
