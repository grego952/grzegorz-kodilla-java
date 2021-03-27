package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    void testUpdate() {
        //Given
        Homework collections = new CollectionsHomework();
        Homework restApi = new RestApiHomework();
        Homework loop = new LoopHomework();
        Mentor sgk = new Mentor("SGK");
        Mentor az = new Mentor("AZ");

        collections.registerMentor(sgk);
        restApi.registerMentor(sgk);
        restApi.registerMentor(az);
        loop.registerMentor(sgk);

        //When
        collections.addHomework("Lists Homework");
        collections.addHomework("Maps homework");
        restApi.addHomework("Controller homework");
        restApi.addHomework("Mapper homework");
        loop.addHomework("Calculate average");
        loop.addHomework("For each loop");

        //Then
        assertEquals(6, sgk.getUpdateCount());
        assertEquals(2, az.getUpdateCount());
    }
}
