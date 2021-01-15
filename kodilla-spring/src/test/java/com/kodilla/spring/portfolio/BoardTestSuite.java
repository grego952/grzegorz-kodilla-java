package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);


        //When
        board.getDoneList().addTask("Walk the dog");
        board.getInProgressList().addTask("Do the dishes");
        board.getToDoList().addTask("Do shopping");

        String doneTask = board.getDoneList().getTasks().get(0);
        String inProgressTask = board.getInProgressList().getTasks().get(0);
        String toDoTask = board.getToDoList().getTasks().get(0);

        //Then
        System.out.println(doneTask);
        System.out.println(inProgressTask);
        System.out.println(toDoTask);

    }

}
