package top.appd.relationship.services_appd.manytomany_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.appd.relationship.models_appd.manytomany_appd.EmployeeAppd;
import top.appd.relationship.repositories_appd.manytomany_appd.EmployeeRepositoryAppd;

import java.util.List;

@Service
public class EmployeeServiceAppd {

    @Autowired
    private EmployeeRepositoryAppd employeeRepositoryAppd;

    public List<EmployeeAppd> getAllEmployees() {
        return employeeRepositoryAppd.findAll();
    }

    public EmployeeAppd getEmployeeById(Long id) {
        return employeeRepositoryAppd.findById(id).orElseThrow(() -> new RuntimeException("Employee Not Found!"));
    }

    public EmployeeAppd createEmployee(EmployeeAppd employee) {
        return employeeRepositoryAppd.save(employee);
    }

}