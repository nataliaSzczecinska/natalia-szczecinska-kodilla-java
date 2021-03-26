package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class HomeworkTasksQueue implements Observable{
    private List<Observer> observerList;
    private List<HomeworkTask> homeworkTasks;
    private final Student student;

    public HomeworkTasksQueue(Student student) {
        this.observerList = new ArrayList<>();
        this.homeworkTasks = new ArrayList<>();
        this.student = student;
    }

    public void addHomeworkTask(HomeworkTask task) {
        homeworkTasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public List<HomeworkTask> getHomeworkTasks() {
        return homeworkTasks;
    }

    public Student getStudent() {
        return student;
    }
}
