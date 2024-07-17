package top.appd.relationship.models_appd.onetoone_appd;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addresses")
public class AddressAppd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_appd;
    String street_appd;
    String city_appd;
    @JsonIgnore
    @OneToOne(mappedBy = "address")
    UserAppd user_appd;
}
