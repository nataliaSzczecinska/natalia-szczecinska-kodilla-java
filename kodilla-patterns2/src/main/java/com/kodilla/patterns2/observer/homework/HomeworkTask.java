package com.kodilla.patterns2.observer.homework;

public class HomeworkTask {
    private String taskName;
    private String taskDescription;

    public HomeworkTask(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public String toString() {
        return "Task: " + taskName + '\n' +
                taskDescription;
    }
}
