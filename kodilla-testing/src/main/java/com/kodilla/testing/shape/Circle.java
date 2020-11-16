package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;

    public Circle(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName(String shapeName) {
        return this.shapeName;
    }
    public double getField(int a) {
        return 3.14 * (a * a);
    }
}
