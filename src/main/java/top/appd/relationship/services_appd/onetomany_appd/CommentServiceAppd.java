package top.appd.relationship.services_appd.onetomany_appd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.appd.relationship.models_appd.onetomany_appd.CommentAppd;
import top.appd.relationship.repositories_appd.onetomany_appd.CommentRepositoryAppd;

import java.util.List;

@Service
public class CommentServiceAppd {

    @Autowired
    private CommentRepositoryAppd commentRepositoryAppd;

    public List<CommentAppd> getAllComments() {
        return commentRepositoryAppd.findAll();
    }

    public CommentAppd createComment(CommentAppd comment) {
        return commentRepositoryAppd.save(comment);
    }

}