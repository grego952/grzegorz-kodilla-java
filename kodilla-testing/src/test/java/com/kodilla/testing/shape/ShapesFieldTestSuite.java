package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesFieldTestSuite {

    @Test
    void testCircleField() {
        //Given
        Circle circle = new Circle("Circle");
        int a = 8;

        //When
        double result = circle.getField(8);

        //Then
        assertEquals(200.96, result, 0.0001);
    }

    @Test
    void testTriangleField() {
        //Given
        Triangle triangle = new Triangle();
        int a = 4;

        //When
        double result = triangle.getField(a);

        //Then
        assertEquals(8, result, 0.0001);
    }

    @Test
    void testRectangleField() {
        //Given
        Rectangle rectangle = new Rectangle();
        int a = 2;

        //When
        double result = rectangle.getField(a);

        //Then
        assertEquals(4, result);

    }
}
