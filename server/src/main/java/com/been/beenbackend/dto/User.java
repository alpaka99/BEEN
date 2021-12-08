package com.been.beenbackend.dto;

public class User {
    private int id;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getFollowerCnt() {
        return followerCnt;
    }

    public void setFollowerCnt(int followerCnt) {
        this.followerCnt = followerCnt;
    }

    public int getFollowingCnt() {
        return followingCnt;
    }

    public void setFollowingCnt(int followingCnt) {
        this.followingCnt = followingCnt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private String intro;
    private String nickname;
    private String name;
    private int tier;
    private int followerCnt;
    private int followingCnt;
    private String createdAt;
    private String profilePicSrc;
    private String profilePicName;
    private int emailConfirmation;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmailConfirmation() {
        return emailConfirmation;
    }

    public void setEmailConfirmation(int emailConfirmation) {
        this.emailConfirmation = emailConfirmation;
    }

    public String getProfilePicSrc() {
        return profilePicSrc;
    }

    public void setProfilePicSrc(String profilePicSrc) {
        this.profilePicSrc = profilePicSrc;
    }

    public String getProfilePicName() {
        return profilePicName;
    }

    public void setProfilePicName(String profilePicName) {
        this.profilePicName = profilePicName;
    }
}
