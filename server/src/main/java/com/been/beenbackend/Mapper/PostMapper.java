package com.been.beenbackend.Mapper;

import com.been.beenbackend.dto.Post;
import com.been.beenbackend.dto.PostPic;

import java.util.List;

public interface PostMapper {
    List<Post> list();

    List<Post> listByUser(int userId);

    int register(Post post);

    void modify(Post post);

    void delete(int postId);

    Post listOne(int postId);

    List<Post> showFollowPost(int id);

    int makeLike(int postId, int userId);

    void removeLike(int postId, int userId);

    List<Post> likePost(int userId);

    int registerPic(PostPic postPic);

    List<PostPic> getPostPic(int postId);

    void deletePic(int postId);
}
