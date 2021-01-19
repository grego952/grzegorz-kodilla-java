package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void saveToLog() {
        logger = Logger.LOG_IN;
        logger.log("User logged in");
    }

    @Test
    void testGetLastLog() {

        //Given
        //When
        String result = logger.getLastLog();

        //Then
        assertEquals ("User logged in", result);
    }
}
