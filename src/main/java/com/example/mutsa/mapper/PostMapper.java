package com.example.mutsa.mapper;

import com.example.mutsa.dto.PostDto;

import java.util.List;

public interface PostMapper {
    int createPost(PostDto dot);

    PostDto readPost(int id);

    List<PostDto> readPostAll();

    int updatePost(PostDto postDto);

    int deletePost(int id);

    PostDto readPostQuery(PostDto dto);

    int createPostAll(List<PostDto> dtoList);

}
