package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.*;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int [] integers = {3, 3, 6};


        //When
        double sum = 0;
        for (Integer num : integers) {
            sum += num;
        }
        double expectedAverage = sum / integers.length;
        double actualAverage = getAverage(integers);

        //Then
        assertEquals(expectedAverage, actualAverage);
    }

}
