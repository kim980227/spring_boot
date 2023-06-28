package com.example.mutsa;

import com.example.mutsa.dao.BoardDao;
import com.example.mutsa.dao.PostDao;
import com.example.mutsa.dto.BoardDto;
import com.example.mutsa.dto.PostDto;
import com.example.mutsa.entity.BoardEntity;
import com.example.mutsa.entity.PostEntity;
import com.example.mutsa.repository.BoardRepository;
import com.example.mutsa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestComponent {
//    private final PostDao postDao;
//    private final BoardDao boardDao;

    public TestComponent(
//            @Autowired PostDao postDao,
//            @Autowired BoardDao boardDao,
            @Autowired BoardRepository boardRepository,
            @Autowired PostRepository postRepository) {
//        this.postDao = postDao;
//        this.boardDao = boardDao;
//        PostDto newPost = new PostDto();
//        newPost.setTitle("From Mybatis");
//        newPost.setContent("User Database with Spring Boot!");
//        newPost.setWriter("seung woo kim");
//        newPost.setBoard(1);
//        this.postDao.createPost(newPost);
//
//        List<PostDto> postDtoList = this.postDao.readPostAll();
//        System.out.println(postDtoList.get(postDtoList.size() - 1));
//
//        PostDto firstPost = postDtoList.get(0);
//        firstPost.setContent("content updated from mybatis!");
//        postDao.updatePost(firstPost);
//
//        BoardDto boardDto = new BoardDto();
//        boardDto.setName("new board");
//        this.boardDao.createBoard(boardDto);
//        System.out.println(boardDto.getId());

//        BoardEntity boardEntity = new BoardEntity();
//        boardEntity.setName("new Name");
//        BoardEntity newBoardEntity = boardRepository.save(boardEntity); // 보드엔티티 재활용 x, 새로 만들어주기
//
//        PostEntity postEntity = new PostEntity();
//        postEntity.setTitle("hello ORM");
//        postEntity.setContent("this is created by hiberante");
//        postEntity.setWriter("seung woo kim");
//        postEntity.setBoardEntity(newBoardEntity);
//        PostEntity newPostEntity = postRepository.save(postEntity);
//
//        System.out.println((postRepository.findAllByWriterAndBoardEntity("seung woo kim",1).size()));
    }
}
