package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Grocery", "Apples", 25);
            case PAINTING:
                return new PaintingTask("Living Room", "Blue", "left wall");
            case DRIVING:
                return new DrivingTask("Drive", "to work", "Ferrari");
            default:
                return null;
        }
    }
}
