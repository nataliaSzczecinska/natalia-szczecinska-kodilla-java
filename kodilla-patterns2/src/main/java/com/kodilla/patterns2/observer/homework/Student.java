package com.kodilla.patterns2.observer.homework;

public class Student {
    private String firstName;
    private String lastName;
    private HomeworkTasksQueue homeworkTasksQueue;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        homeworkTasksQueue = new HomeworkTasksQueue(this);
    }

    public void addTask(HomeworkTask task) {
        homeworkTasksQueue.addHomeworkTask(task);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public HomeworkTasksQueue getHomeworkTasksQueue() {
        return homeworkTasksQueue;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}
