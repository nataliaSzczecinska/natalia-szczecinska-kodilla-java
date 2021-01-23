package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTestSuite {

    private TaskFactory taskFactory = new TaskFactory();

    @Test
    void testFactoryShoppingTask() {
        //Given

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        boolean execute = shopping.isTaskExecuted();
        shopping.executeTask();

        //Then
        assertEquals("Shopping Task", shopping.getTaskName());
        assertFalse(execute);
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        boolean execute = painting.isTaskExecuted();
        painting.executeTask();

        //Then
        assertEquals("Painting Task", painting.getTaskName());
        assertFalse(execute);
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        boolean execute = driving.isTaskExecuted();
        driving.executeTask();

        //Then
        assertEquals("Driving Task", driving.getTaskName());
        assertFalse(execute);
        assertTrue(driving.isTaskExecuted());
    }
}