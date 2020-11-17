package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("TDD: ShapeCollectorTestSuite")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for Shapes")
    class TestShapes {
        @Test
        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Circle("Circle"));

            //Then
            assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Rectangle rectangle = new Rectangle();
            shapeCollector.addFigure(rectangle);

            //When
            boolean result = shapeCollector.removeFigure(rectangle);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle();
            shapeCollector.addFigure(triangle);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(triangle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle");
            shapeCollector.addFigure(circle);
            //When
            shapeCollector.showFigures();

            //Then
        }
    }
}