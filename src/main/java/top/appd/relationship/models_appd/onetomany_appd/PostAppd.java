package top.appd.relationship.models_appd.onetomany_appd;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Data
@RequiredArgsConstructor

public class PostAppd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_appd;
    String title_appd;
    String description_appd;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id_appd", referencedColumnName = "id_appd")
    Set<CommentAppd> comments_appd = new HashSet<>();
}
