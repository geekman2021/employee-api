package com.arkeup.employee_api.services.applicatif;


import com.arkeup.employee_api.data.domain.object.Employee;
import com.arkeup.employee_api.services.metier.EmployeeSM;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSAImpl implements EmployeeSA {
    private final EmployeeSM employeeSM;

    public EmployeeSAImpl(EmployeeSM employeeSM) {
        this.employeeSM = employeeSM;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return  employeeSM.saveEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeSM.updateEmployee(employee);
    }

    @Override
    public Optional<Employee> removeEmployee(Integer id) {
        return employeeSM.deleteEmployee(id);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeSM.findEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeSM.findAllEmployee();
    }

}
