package top.appd.relationship.controller_appd.onetoone_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.appd.relationship.models_appd.onetoone_appd.UserAppd;
import top.appd.relationship.services_appd.onetoone_appd.UserServiceAppd;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserAddressControllerAppd {

    @Autowired
    private UserServiceAppd userServiceAppd;

    @GetMapping(path = "/users")
    public ResponseEntity<List<UserAppd>> getUsers() {
        return ResponseEntity.ok().body(userServiceAppd.getAllUsers());
    }

    @PostMapping(path = "/users")
    public ResponseEntity<UserAppd> createUser(@RequestBody UserAppd user) {
        return new ResponseEntity<>(userServiceAppd.createUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userServiceAppd.deleteUser(id);
        return ResponseEntity.ok("User Deleted");
    }

}