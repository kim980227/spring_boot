package com.example.mutsa.Post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceSimple implements PostService {
    private static final Logger logger = LoggerFactory.getLogger(PostServiceSimple.class);
    private final PostRepositroy postRepositroy; // 인터페이스를 쓰는 이유 : 구현이 어떤식으로 되어있는지 상관x

    @Autowired
    public PostServiceSimple(PostRepositroy postRepositroy) {
        this.postRepositroy = postRepositroy; // 우선순위가 높은 구현체를 가져온다. 지금은 PostInMemory 밖에 구현체가 없기때문에 그 클래스를 가져온다.
    }


    @Override
    public void createPost(PostDto dto) {
        //TODO
        if (!this.postRepositroy.save(dto)) {
            throw new RuntimeException("save failed");
        }
    }

    @Override
    public List<PostDto> readPostAll() {
        return this.postRepositroy.findAll();
    }

    @Override
    public PostDto readPost(int id) {
        return this.postRepositroy.findById(id);
    }

    @Override
    public void updatePost(int id, PostDto dto) {
        this.postRepositroy.update(id, dto);
    }

    @Override
    public void deletePost(int id) {
        this.postRepositroy.delete(id);
    }
}
