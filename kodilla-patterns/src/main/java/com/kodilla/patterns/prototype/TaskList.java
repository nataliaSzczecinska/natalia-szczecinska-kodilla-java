package com.kodilla.patterns.prototype;

import java.util.*;

public class TaskList {

    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TaskList(final String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return Objects.equals(name, taskList.name) &&
                Objects.equals(tasks, taskList.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }
}