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
        int [] integers1 = {2, 5, 23, 54, 5, 7, 54, 32, 42, 88, 56, 56, 6, 9, 2, 56, 99, 4, 57, 11};


        //When
       double actualAverage = getAverage(integers);
       double actualAverage1 = getAverage(integers1);

        //Then
        assertEquals(4, actualAverage);
        assertEquals(33.4, actualAverage1);
    }

}
