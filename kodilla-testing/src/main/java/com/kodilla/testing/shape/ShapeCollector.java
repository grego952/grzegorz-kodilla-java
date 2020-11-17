package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeList = new ArrayList<>();

    void addFigure (Shape shape) {

        Shape circle = new Circle("Circle");
        shapeList.add(shape);

    }
    boolean removeFigure (Shape shape) {
        
        Shape rectangle = new Rectangle();
        return shapeList.remove(shape);
    }

    Shape getFigure (int n) {
        if (n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        }

        return null;
    }
    void showFigures() {

        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }

    public int getShapesQuantity() {
        return shapeList.size();
    }

}
