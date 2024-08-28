package com.arkeup.employee_api.services.metier;

import com.arkeup.employee_api.data.domain.object.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arkeup.employee_api.services.repository.EmployeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSMImpl implements EmployeeSM {
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        validateEmployee(employee);
        return employeRepository.save(employee);
    }
    @Override
    public Optional<Employee> deleteEmployee(Integer id) {
       Optional<Employee> employee=  employeRepository.findById(id);
       if(employee.isPresent()) {
           employeRepository.deleteById(id);
           return employee;
       } else {
           System.out.println("Employee not found");
           return null;
       }
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        if(id != null) {
            return employeRepository.findById(id).orElse(null);
        }
        return null;
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee updateEmployee) {
        Optional<Employee> employee = employeRepository.findById(updateEmployee.getId());

        if(employee.isPresent()) {
            Employee oldEmployee= employee.get();
            oldEmployee.setAge(updateEmployee.getAge());
            oldEmployee.setNom(updateEmployee.getNom());
            oldEmployee.setPrenom(updateEmployee.getPrenom());
            oldEmployee.setAdress(updateEmployee.getAdress());
            oldEmployee.setEmail(updateEmployee.getEmail());
            employeRepository.save(oldEmployee);
            return oldEmployee;
        } else {
            return employeRepository.save(updateEmployee);
        }
    }

    private void validateEmployee(Employee employee) {
        if(employee.getAge() == null && employee.getRole() == null && employee.getAdress() == null && employee.getNom() == null) {
            throw new IllegalArgumentException("L'employé doit avoir au moin un des attribut non null(age et role et address)");
        }
        if(employee.getAge() != null && (employee.getAge() < 18 || employee.getAge()> 65)) {
            throw new IllegalArgumentException("L'age doit être entre 18 et 65");
        }
    }

}
