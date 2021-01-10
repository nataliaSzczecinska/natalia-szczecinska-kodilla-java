package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pi, radius);
    }

    @Override
    public String toString() {
        return "Circle, " +
                "radius = " + radius +
                ", field = " + getField();
    }

}
