package com.been.beenbackend.Service;

import com.been.beenbackend.Mapper.CommentMapper;
import com.been.beenbackend.dto.Comment;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Comment> list() {
        return sqlSession.getMapper(CommentMapper.class).list();
    }

    @Override
    public int register(Comment comment) {
        return sqlSession.getMapper(CommentMapper.class).register(comment);
    }

    @Override
    public void modify(Comment comment) {
        sqlSession.getMapper(CommentMapper.class).modify(comment);
    }

    @Override
    public void delete(int commentId) {
        sqlSession.getMapper(CommentMapper.class).delete(commentId);
    }

    @Override
    public Comment listOne(int commentId) {
        return sqlSession.getMapper(CommentMapper.class).listOne(commentId);
    }

    @Override
    public int makeLike(int commentId, int userId) {
        return sqlSession.getMapper(CommentMapper.class).makeLike(commentId, userId);
    }

    @Override
    public int deleteLike(int commentId, int userId) {
        return sqlSession.getMapper(CommentMapper.class).makeLike(commentId, userId);
    }
}

