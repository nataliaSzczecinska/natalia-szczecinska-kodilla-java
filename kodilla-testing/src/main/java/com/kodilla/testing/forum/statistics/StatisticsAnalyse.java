package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class StatisticsAnalyse {
    private int usersAmount = 0;
    private int postsAmount = 0;
    private int commentsAmount = 0;
    private double avgPostsPerUser = 0.0;
    private double avgCommentsPerUser = 0.0;
    private double avgCommentsPerPost = 0.0;

    public StatisticsAnalyse() {
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatisticsAnalyse that = (StatisticsAnalyse) o;

        return usersAmount == that.usersAmount &&
                postsAmount == that.postsAmount &&
                commentsAmount == that.commentsAmount &&
                Double.compare(that.avgPostsPerUser, avgPostsPerUser) == 0 &&
                Double.compare(that.avgCommentsPerUser, avgCommentsPerUser) == 0 &&
                Double.compare(that.avgCommentsPerPost, avgCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersAmount, postsAmount, commentsAmount, avgPostsPerUser, avgCommentsPerUser, avgCommentsPerPost);
    }

    public void calculateAdvStatistics(Statistics statistics){
        //
    }

    public void showStatistics() {
        String text = "There are " + usersAmount + "users. " +
                "\nThere are " + postsAmount + "posts. " +
                "\nThere are " + commentsAmount + "coments. " +
                "\nAverage posts per user = " + avgPostsPerUser +
                ".\nAverage comments per user = " + avgCommentsPerUser +
                ".\nAverage comments per post = " + avgCommentsPerPost;
    }
}
