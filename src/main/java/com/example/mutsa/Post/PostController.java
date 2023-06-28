package com.example.mutsa.Post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("post")
public class PostController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private final List<PostDto> postList;

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
        postList = new ArrayList<>();
    }

    @PostMapping("create")
    public void createPost(@RequestBody PostDto postDto) {
        logger.info(postDto.toString());
        this.postList.add(postDto);
    }

    @GetMapping("read-all")
    public List<PostDto> readPostALL() {
        logger.info("in read all");
        return this.postList;
    }

    @GetMapping("read-one")
    public PostDto readPostOne(@RequestParam("id") int id) {
        logger.info("in read one");
        return this.postList.get(id);
    }

    @PostMapping("update")
    public void updatePost(@RequestParam("id") int id, @RequestBody PostDto postDto) {
        PostDto targetPost = this.postList.get(id);
        if (postDto.getTitle() != null) {
            targetPost.setTitle(postDto.getTitle());
        }
        if (postDto.getContent() != null) {
            targetPost.setContent(postDto.getContent());
        }
        if (postDto.getWriter() != null) {
            targetPost.setWriter(postDto.getWriter());
        }
        this.postList.set(id, targetPost);
    }

    @DeleteMapping("delete")
    public void deletePost(@RequestParam("id") int id) {
        this.postList.remove(id);
    }
}
