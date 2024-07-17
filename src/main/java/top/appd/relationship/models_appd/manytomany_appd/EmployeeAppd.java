package top.appd.relationship.models_appd.manytomany_appd;

import jakarta.persistence.*;
import lombok.Data;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employees_appd")
@Data
public class EmployeeAppd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_appd;
    String name_appd;
    String email_appd;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_roles_appd",
            joinColumns = @JoinColumn(
                    name = "employee_id_appd", referencedColumnName = "id_appd"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id_appd", referencedColumnName = "id_appd"
            )
    )
    Set<RoleAppd> roles_appd = new HashSet<>();
}
