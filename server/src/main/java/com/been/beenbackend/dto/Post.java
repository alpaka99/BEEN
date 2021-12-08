package com.been.beenbackend.dto;

public class Post {
    private int postId;
    private int userId;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;
    private int likeCnt;
    private String postPicSrc;
    private String postPicName;

    public String getPostPicSrc() {
        return postPicSrc;
    }

    public void setPostPicSrc(String postPicSrc) {
        this.postPicSrc = postPicSrc;
    }

    public String getPostPicName() {
        return postPicName;
    }

    public void setPostPicName(String postPicName) {
        this.postPicName = postPicName;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        this.likeCnt = likeCnt;
    }
}
