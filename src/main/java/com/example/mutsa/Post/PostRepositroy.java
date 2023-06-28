package com.example.mutsa.Post;

        import java.util.List;

public interface PostRepositroy {
    PostDto findById(int id);

    boolean save(PostDto postDto);

    boolean delete(int id);

    boolean update(int id, PostDto postDto);

    List<PostDto> findAll();

}
