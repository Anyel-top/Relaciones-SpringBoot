package top.appd.relationship.repositories_appd.manytomany_appd;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.appd.relationship.models_appd.manytomany_appd.RoleAppd;

@Repository
public interface RoleRepositoryAppd extends JpaRepository<RoleAppd, Long> {}
