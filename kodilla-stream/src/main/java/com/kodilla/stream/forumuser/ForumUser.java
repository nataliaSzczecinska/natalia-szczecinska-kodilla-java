package com.kodilla.stream.forumuser;

import java.time.*;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthday;
    private final int publishPosts;

    public ForumUser(int userID, String userName, char sex, LocalDate birthday, int publishPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.publishPosts = publishPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPublishPosts() {
        return publishPosts;
    }

    @Override
    public String toString() {
        return "ID: " + userID +
                ", userName: '" + userName + '\'' +
                ", sex: " + sex +
                ", birthday: " + birthday +
                ", publishPosts: " + publishPosts;
    }
}
