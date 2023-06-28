package com.example.mutsa.dao;

import com.example.mutsa.dto.BoardDto;
import com.example.mutsa.mapper.BoardMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
    private final SqlSessionFactory sessionFactory;

    public BoardDao(@Autowired SqlSessionFactory sqlSessionFactory) {
        this.sessionFactory = sqlSessionFactory;
    }
    public int createBoard(BoardDto boardDto){
        try (SqlSession session = sessionFactory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            return mapper.createBoard(boardDto);
        }
    }


}
