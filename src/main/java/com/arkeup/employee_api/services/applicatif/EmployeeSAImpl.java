package com.arkeup.employee_api.services.applicatif;


import com.arkeup.employee_api.data.domain.object.Employee;
import com.arkeup.employee_api.data.dto.EmployeeDTO;
import com.arkeup.employee_api.mapper.ModelMapper;
import com.arkeup.employee_api.services.metier.EmployeeSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSAImpl implements EmployeeSA {
    @Autowired
    private  EmployeeSM employeeSM;

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
