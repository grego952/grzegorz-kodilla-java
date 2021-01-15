package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BoardConfig {

    @Qualifier("to do")
    @Autowired
    TaskList toDoList;

    @Qualifier("in progress")
    @Autowired
    TaskList inProgressList;

    @Qualifier("done")
    @Autowired
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "to do")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean (name = "in progress")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean (name = "done")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
