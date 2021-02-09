package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


import java.util.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private final String listName = "TO DO LIST";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName, "THINGS TO DO");

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> readList = taskListDao.findByListName(listName);
        assertEquals(listName, readList.get(0).getListName());

        //Clean up
        taskListDao.deleteAll();
    }
}
