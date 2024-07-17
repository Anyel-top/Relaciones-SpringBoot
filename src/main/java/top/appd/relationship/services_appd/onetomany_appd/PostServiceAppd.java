package top.appd.relationship.services_appd.onetomany_appd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.appd.relationship.models_appd.onetomany_appd.PostAppd;
import top.appd.relationship.repositories_appd.onetomany_appd.PostRepositoryAppd;

@Service
public class PostServiceAppd {

    @Autowired
    private PostRepositoryAppd postRepositoryAppd;

    public PostAppd getPostById(Long id) {
        return postRepositoryAppd.findById(id).orElseThrow(() -> new RuntimeException("Post Not Found!"));
    }

    public PostAppd createPost(PostAppd post) {
        return postRepositoryAppd.save(post);
    }

}