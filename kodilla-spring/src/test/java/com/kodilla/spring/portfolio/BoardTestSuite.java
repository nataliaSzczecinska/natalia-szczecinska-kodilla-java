package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class BoardTestSuite {

    @Test
    public void testTaskAddition() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getDoneList().addTask("first done task");
        board.getDoneList().addTask("second done task");

        board.getInProgressList().addTask("fist task in progress");
        board.getInProgressList().addTask("second task in progress");

        board.getToDoList().addTask("first new task to do");

        //When
        TaskList taskDone = board.getDoneList();
        TaskList taskInProgress = board.getInProgressList();
        TaskList taskToDo = board.getToDoList();

        //Then
        Assert.assertEquals("first done task", taskDone.getTasks().get(taskDone.getTasks().size() - 2));
        Assert.assertEquals("second done task", taskDone.getTasks().get(taskDone.getTasks().size() - 1));
        Assert.assertEquals("fist task in progress", taskInProgress.getTasks().get(taskInProgress.getTasks().size() - 2));
        Assert.assertEquals("second task in progress", taskInProgress.getTasks().get(taskInProgress.getTasks().size() - 1));
        Assert.assertEquals("first new task to do", taskToDo.getTasks().get(taskToDo.getTasks().size() - 1));
    }
}
