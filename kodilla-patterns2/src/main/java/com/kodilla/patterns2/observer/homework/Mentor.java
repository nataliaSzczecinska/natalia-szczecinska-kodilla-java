package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String firstName;
    private String lastName;
    private int quantityOfActualTasks;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        quantityOfActualTasks = 0;
    }

    @Override
    public void update(HomeworkTasksQueue homeworkTasksQueue) {
        System.out.println("There is a new task from student " + homeworkTasksQueue.getStudent() +
                "\n" + homeworkTasksQueue.getHomeworkTasks().get(homeworkTasksQueue.getHomeworkTasks().size() - 1));
        quantityOfActualTasks++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getQuantityOfActualTasks() {
        return quantityOfActualTasks;
    }
}
