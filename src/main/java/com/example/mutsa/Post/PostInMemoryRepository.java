package com.example.mutsa.Post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostInMemoryRepository implements PostRepositroy {
    private static final Logger logger = LoggerFactory.getLogger(PostInMemoryRepository.class);
    private final List<PostDto> postList;

    public PostInMemoryRepository() {
        this.postList = new ArrayList<>();
    }

    @Override
    public PostDto findById(int id) {
        return postList.get(id);
    }

    @Override
    public boolean save(PostDto postDto) {
        return this.postList.add(postDto);
    }

    @Override
    public boolean delete(int id) {
        this.postList.remove(id);
        return true;
    }

    @Override
    public boolean update(int id, PostDto postDto) {
        {
            PostDto taragetPost = this.postList.get(id);
            if (postDto.getTitle() != null) {
                taragetPost.setTitle(postDto.getTitle());
            }
            if (postDto.getContent() != null) {
                taragetPost.setContent(postDto.getContent());
            }
            this.postList.set(id, taragetPost);
            ;
            return true;
        }
    }

    @Override
    public List<PostDto> findAll() {
        return this.postList;
    }

}
