package top.appd.relationship.models_appd.manytomany_appd;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employees_appd")
@Data
public class RoleAppd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_appd;
    String name_appd;
    @ManyToMany(mappedBy = "roles_appd")
    @JsonIgnore
    Set<EmployeeAppd> employees_appd = new HashSet<>();
}
