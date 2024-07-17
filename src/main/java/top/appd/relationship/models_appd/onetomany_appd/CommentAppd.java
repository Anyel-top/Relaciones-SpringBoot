package top.appd.relationship.models_appd.onetomany_appd;

import jakarta.persistence.*;
import lombok.Data;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "comments_appd")
@Data
public class CommentAppd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_appd;
    String author_appd;
    String content_appd;
    @Column(name = "post_id")
    Long postId;
}
