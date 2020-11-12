package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Starting tests for empty and normal list");
    }
    @AfterEach
    public void after() {
        System.out.println("Ending tests for empty and normal list");
    }

    @DisplayName("When created empty list "+
    "then the class works fine")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbers.exterminate(emptyList);
        //Then
        List<Integer> expectedList = new ArrayList<>();

        Assert.assertEquals(0, result.size());
        Assert.assertTrue(result.containsAll(expectedList));
    }
    @DisplayName("When created list with odd and even numbers "+
            "then the class works fine")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbers2 = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        //When
        List<Integer> result2 = oddNumbers2.exterminate(normalList);

        //Then
        List<Integer> expectedList2 = new ArrayList<>();
        expectedList2.add(2);
        expectedList2.add(4);
        expectedList2.add(6);

        Assert.assertEquals(3, result2.size());
        Assert.assertTrue(result2.containsAll(expectedList2));
    }
}
