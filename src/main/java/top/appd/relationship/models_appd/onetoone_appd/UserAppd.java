package top.appd.relationship.models_appd.onetoone_appd;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class UserAppd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_appd;
    String name_appd;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id_appd", referencedColumnName = "id_appd")
    AddressAppd address_appd;
}
