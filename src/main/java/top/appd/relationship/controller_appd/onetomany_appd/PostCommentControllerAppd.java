package top.appd.relationship.controller_appd.onetomany_appd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.appd.relationship.models_appd.onetomany_appd.CommentAppd;
import top.appd.relationship.models_appd.onetomany_appd.PostAppd;
import top.appd.relationship.services_appd.onetomany_appd.CommentServiceAppd;
import top.appd.relationship.services_appd.onetomany_appd.PostServiceAppd;

import java.util.List;

@RestController
@RequestMapping("api")
public class PostCommentControllerAppd {

    @Autowired
    private CommentServiceAppd commentServiceAppd;

    @Autowired
    private PostServiceAppd postServiceAppd;

    @GetMapping(path = "/comments")
    public ResponseEntity<List<CommentAppd>> getComments() {
        return ResponseEntity.ok().body(commentServiceAppd.getAllComments());
    }

    @PostMapping(path = "/comments")
    public ResponseEntity<CommentAppd> createComment(@RequestBody CommentAppd comment) {
        return new ResponseEntity<>(commentServiceAppd.createComment(comment), HttpStatus.CREATED);
    }

    @GetMapping(path = "/posts/{id}")
    public ResponseEntity<PostAppd> getPost(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(postServiceAppd.getPostById(id));
    }

    @PostMapping(path = "/posts")
    public ResponseEntity<PostAppd> createPost(@RequestBody PostAppd post) {
        return new ResponseEntity<>(postServiceAppd.createPost(post), HttpStatus.CREATED);
    }
}