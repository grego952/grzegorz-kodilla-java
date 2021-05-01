package com.kodilla.testing.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    void testCalculatorMethods() {

        //Given
        Calculator calculator = new Calculator();
        int a = 50;
        int b = 40;

        //When
        int addResult = calculator.add(a, b);
        int subtractResult = calculator.subtract(a, b);

        //Then
        assertEquals(90, addResult);
        assertEquals (10, subtractResult);

    }
}
