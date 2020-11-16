package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeList = new ArrayList<>();

    void addFigure (Shape shape) {

        Circle circle = new Circle("Circle");
        shapeList.add(circle);

    }
    boolean removeFigure (Shape shape) {

        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    Shape getFigure (int n) {
        if (n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        }

        return null;
    }
    void showFigures() {

        System.out.println("Circle, Rectangle, Triangle");
    }

    public int getShapesQuantity() {
        return shapeList.size();
    }

}
