package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        assertEquals(true, shopping.executeTask());
        assertEquals("Grocery", shopping.getTaskName());
    }
    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);

        //Then
        assertEquals(false, painting.executeTask());
        assertEquals("Living Room", painting.getTaskName());

    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        assertEquals(true, driving.executeTask());
        assertEquals("Drive", driving.getTaskName());

    }

}
