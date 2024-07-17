package top.appd.relationship.services_appd.onetoone_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.appd.relationship.models_appd.onetoone_appd.UserAppd;
import top.appd.relationship.repositories_appd.onetoone_appd.UserRepositoryAppd;

import java.util.List;

@Service
public class UserServiceAppd {

    @Autowired
    private UserRepositoryAppd userRepositoryAppd;

    public List<UserAppd> getAllUsers() {
        return userRepositoryAppd.findAll();
    }

    public UserAppd createUser(UserAppd user) {
        return userRepositoryAppd.save(user);
    }

    public void deleteUser(Long id) {
        userRepositoryAppd.deleteById(id);
    }

}