package com.kodilla.hibernate.manytomany.facade;

public class SQLCondition {
    public static String sqlCondition(String text) {
        return ("%" + text + "%");
    }
}
