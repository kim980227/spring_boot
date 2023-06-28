package com.example.mutsa.Post;

import java.util.List;

public interface PostService {
    void createPost(PostDto dto);
    List<PostDto> readPostAll();

    PostDto readPost(int id);

    void updatePost(int id, PostDto dto);

    void deletePost(int id);
}
