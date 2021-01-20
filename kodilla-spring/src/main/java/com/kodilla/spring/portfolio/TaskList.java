package com.kodilla.spring.portfolio;

import java.util.*;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String newTask) {
        this.tasks.add(newTask);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
