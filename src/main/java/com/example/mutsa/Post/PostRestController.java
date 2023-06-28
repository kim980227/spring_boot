package com.example.mutsa.Post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("restpost")
public class PostRestController {
    private static final Logger logger = LoggerFactory.getLogger(PostRestController.class);
    private final PostService postService;


    @Autowired
    public PostRestController(PostService postService) {
        this.postService = postService;
    }


    // http://localhsot:8080/post => 들어오면 post에 대한 정보를 볼 수 있다.
    @PostMapping()
    // POST /post
    // REQEUST_BODY
    public void createPost(@RequestBody PostDto postDto) {
        logger.info(postDto.toString());
        postService.createPost(postDto);
    }

    @GetMapping()
    public List<PostDto> readPostAll() {
        logger.info("in read post all");
        return postService.readPostAll();
    }

    //GET /post/0
    //GET /post?id=0
    @GetMapping("{id}")
    public PostDto readPost(@PathVariable("id") int id) {
        logger.info("in read post");
        return postService.readPost(id);
    }

    // PUT / post/0
    @PutMapping("{id}")
    public void updatePost(
            @PathVariable("id") int id,
            @RequestBody PostDto postDto
    ) {
        PostDto taragetPost =postService.readPost(id);
        if (postDto.getTitle() != null) {
            taragetPost.setTitle(postDto.getTitle());
        }
        if (postDto.getContent() != null) {
            taragetPost.setContent(postDto.getContent());
        }
        postService.updatePost(id,postDto);
    }

    // DELETE /post/0
    @DeleteMapping("{id}")
    public void deletePost(@PathVariable("id") int id) {postService.deletePost(id);
    }

    // Post 컨트롤러에 정의된 메소드와 경로
    // POST /post
    // GET /post/0
    // PUT / post/0
    // DELETE /post/0

}



