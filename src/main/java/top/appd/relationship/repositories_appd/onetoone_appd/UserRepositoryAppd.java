package top.appd.relationship.repositories_appd.onetoone_appd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.appd.relationship.models_appd.onetoone_appd.UserAppd;

@Repository
public interface UserRepositoryAppd extends JpaRepository<UserAppd, Long> {
}