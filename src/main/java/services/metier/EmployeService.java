package services.metier;

import commun.domain.object.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import services.repository.EmployeRepository;

public class EmployeService {

    @Autowired
    private  EmployeRepository employeRepository;

    public void saveEmploye(Employee employee) {

    }

}
