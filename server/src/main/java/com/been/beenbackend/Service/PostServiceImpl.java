package com.been.beenbackend.Service;

import com.been.beenbackend.Mapper.PostMapper;
import com.been.beenbackend.dto.Post;
import com.been.beenbackend.dto.PostPic;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Post> list() {
        return sqlSession.getMapper(PostMapper.class).list();
    }

    @Override
    public List<Post> listByUser(int userId) {
        return sqlSession.getMapper(PostMapper.class).listByUser(userId);
    }

    @Override
    public int register(Post post) {
        return sqlSession.getMapper(PostMapper.class).register(post);

    }

    @Override
    public void modify(Post post) {
        sqlSession.getMapper(PostMapper.class).modify(post);

    }

    @Override
    public void delete(int postId) {
        sqlSession.getMapper(PostMapper.class).delete(postId);

    }

    @Override
    public Post listOne(int postId) {
        return sqlSession.getMapper(PostMapper.class).listOne(postId);

    }

    @Override
    public List<Post> showFollowPost(int id) {
        return sqlSession.getMapper(PostMapper.class).showFollowPost(id);
    }

    @Override
    public int makeLike(int postId, int userId) {
        return sqlSession.getMapper(PostMapper.class).makeLike(postId, userId);
    }

    @Override
    public void removeLke(int postId, int userId) {
        sqlSession.getMapper(PostMapper.class).removeLike(postId, userId);
    }

    @Override
    public List<Post> likePost(int userId) {
        return sqlSession.getMapper(PostMapper.class).likePost(userId);
    }

    @Override
    public int registerPic(PostPic postPic) {
        return sqlSession.getMapper(PostMapper.class).registerPic(postPic);
    }

    @Override
    public List<PostPic> getPostPic(int postId) {
        return sqlSession.getMapper(PostMapper.class).getPostPic(postId);
    }

    @Override
    public void deletePic(int postId) {
        sqlSession.getMapper(PostMapper.class).deletePic(postId);
    }
}
