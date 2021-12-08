package com.been.beenbackend.Mapper;

import com.been.beenbackend.dto.User;

import java.util.List;

public interface UserMapper {
    List<User> list();

    int register(User user);

    void modify(User user);

    void delete(int id);

    User listOneById(int id);

    User listOneByEmail(String email);

    User signIn(String email, String password);

    void makeFollow(int followedId, int followerId);

    void removeFollow(int followedId, int followerId);

    void acceptFollow(int followedId, int followerId);

    List<User> findUser(String email);

    void updatePic(User user);
}

