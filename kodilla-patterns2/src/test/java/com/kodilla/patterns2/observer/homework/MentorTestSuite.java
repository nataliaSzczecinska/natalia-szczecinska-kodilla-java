package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MentorTestSuite {

    @Test
    public void testTasksUpdate() {
        //Given
        Student student1 = new Student("Anna", "Nowak");
        Student student2 = new Student("Jan", "Kowalski");

        HomeworkTask task1 = new HomeworkTask("Task1", "Description1");
        HomeworkTask task2 = new HomeworkTask("Task2", "Description2");
        HomeworkTask task3 = new HomeworkTask("Task3", "Description3");

        HomeworkTasksQueue queue1 = student1.getHomeworkTasksQueue();
        HomeworkTasksQueue queue2 = student2.getHomeworkTasksQueue();

        Mentor mentor = new Mentor("Wojciech", "Kodilla");

        queue1.registerObserver(mentor);
        queue2.registerObserver(mentor);

        //When
        queue1.addHomeworkTask(task1);
        queue2.addHomeworkTask(task2);
        queue2.addHomeworkTask(task3);

        //Then
        assertEquals(3, mentor.getQuantityOfActualTasks());
    }
}
