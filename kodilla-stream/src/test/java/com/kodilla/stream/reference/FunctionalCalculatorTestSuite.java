package com.kodilla.stream.reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalCalculatorTestSuite {

    @Test
    void testCalculatorMethods() {

        //Given & When
        double addResult = FunctionalCalculator.addAToB(-50.5, 50);
        double divideResult = FunctionalCalculator.divideAByB(100.5, -50);
        double multiplyResult = FunctionalCalculator.multiplyAByB(-20.5, -20.5);
        double subtractResult = FunctionalCalculator.subBFromA(-150.5, - 65.5);

        //Then
        assertEquals (-0.5, addResult, 0.001);
        assertEquals(-2.01, divideResult, 0.001);
        assertEquals(420.25, multiplyResult, 0.001);
        assertEquals(-85, subtractResult, 0.01);

    }
}
