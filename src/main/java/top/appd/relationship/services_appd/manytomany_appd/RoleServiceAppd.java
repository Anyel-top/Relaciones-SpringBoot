package top.appd.relationship.services_appd.manytomany_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.appd.relationship.models_appd.manytomany_appd.RoleAppd;
import top.appd.relationship.repositories_appd.manytomany_appd.RoleRepositoryAppd;

import java.util.List;

@Service
public class RoleServiceAppd {

    @Autowired
    private RoleRepositoryAppd roleRepositoryAppd;

    public List<RoleAppd> getAllRoles() {
        return roleRepositoryAppd.findAll();
    }

    public RoleAppd getRoleById(Long id) {
        return roleRepositoryAppd.findById(id).orElseThrow(() -> new RuntimeException("Role Not Found!"));
    }

    public RoleAppd createRole(RoleAppd role) {
        return roleRepositoryAppd.save(role);
    }

}