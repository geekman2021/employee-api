package com.arkeup.employee_api.mapper;

import com.arkeup.employee_api.data.domain.object.Employee;
import com.arkeup.employee_api.data.dto.EmployeeCreationDTO;
import com.arkeup.employee_api.data.dto.EmployeeDTO;
import com.arkeup.employee_api.data.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

@Component
public class ModelMapper {
    public static  EmployeeDTO employeeToDTO (Employee employee) {
        String nom = employee.getNom();
        String prenom= employee.getPrenom();
        String role= employee.getRole();

        return new EmployeeDTO(nom, prenom, role);
    }

    public static Employee toEmployee(EmployeeCreationDTO employeeCreationDTO) {
        return new Employee(
                employeeCreationDTO.getNom(),
                employeeCreationDTO.getPrenom(),
                employeeCreationDTO.getRole(),
                employeeCreationDTO.getAdresse(),
                employeeCreationDTO.getEmail(),
                employeeCreationDTO.getAge()
        );
    }
}
