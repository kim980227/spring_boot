package com.example.mutsa.repository;

import com.example.mutsa.entity.BoardEntity;
import com.example.mutsa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> findAllByWriter(String writer);
    List<PostEntity> findAllByWriterContaining(String writer);
    List<PostEntity> findAllByWriterAndBoardEntity(String writer, BoardEntity boardEntity);
}
