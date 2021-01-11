package com.kodilla.good.patterns.challenges.order.service;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private String userName;
    private String userId;

    public User(String name, String surname, String userName, String userId) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User: " +
                "\nname: " + name +
                "\nsurname: " + surname +
                "\nuserName: " + userName +
                "\nuserId: " + userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, userName, userId);
    }
}
