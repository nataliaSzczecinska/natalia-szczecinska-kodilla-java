package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String DRIVING_TASK = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping Task", "Book", 50.99);
            case PAINTING_TASK:
                return new PaintingTask("Painting Task", "White", "Living-Room");
            case DRIVING_TASK:
                return new DrivingTask("Driving Task", "Warsaw", "Car");
            default:
                return null;
        }
    }
}
