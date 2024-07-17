package top.appd.relationship.controller_appd.manytomany_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.appd.relationship.models_appd.manytomany_appd.EmployeeAppd;
import top.appd.relationship.models_appd.manytomany_appd.RoleAppd;
import top.appd.relationship.services_appd.manytomany_appd.EmployeeServiceAppd;
import top.appd.relationship.services_appd.manytomany_appd.RoleServiceAppd;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeRoleControllerAppd {

    @Autowired
    private EmployeeServiceAppd employeeServiceAppd;

    @Autowired
    private RoleServiceAppd roleServiceAppd;

    @GetMapping(path = "/employees")
    public ResponseEntity<List<EmployeeAppd>> getEmployees() {
        return ResponseEntity.ok().body(employeeServiceAppd.getAllEmployees());
    }

    @GetMapping(path = "/employees/{id}")
    public ResponseEntity<EmployeeAppd> getEmployee(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(employeeServiceAppd.getEmployeeById(id));
    }

    @PostMapping(path = "/employees")
    public ResponseEntity<EmployeeAppd> createEmployee(@RequestBody EmployeeAppd employee) {
        return new ResponseEntity<>(employeeServiceAppd.createEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping(path = "/roles")
    public ResponseEntity<List<RoleAppd>> getRoles() {
        return ResponseEntity.ok().body(roleServiceAppd.getAllRoles());
    }

    @GetMapping(path = "/roles/{id}")
    public ResponseEntity<RoleAppd> getRole(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(roleServiceAppd.getRoleById(id));
    }

    @PostMapping(path = "/roles")
    public ResponseEntity<RoleAppd> createRole(@RequestBody RoleAppd role) {
        return new ResponseEntity<>(roleServiceAppd.createRole(role), HttpStatus.CREATED);
    }

}