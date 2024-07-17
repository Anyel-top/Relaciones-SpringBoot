package top.appd.relationship.repositories_appd.onetomany_appd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.appd.relationship.models_appd.onetomany_appd.CommentAppd;

@Repository
public interface CommentRepositoryAppd extends JpaRepository<CommentAppd, Long> {
}
