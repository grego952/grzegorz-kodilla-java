package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("House Cleaning", "List describing activities to keep your house clean");
        taskListDao.save(taskList);
        String taskName = taskList.getListName();

        //When
        List<TaskList> readList = taskListDao.findByListName(taskName);

        //Then
        assertEquals(1, readList.size());

        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
