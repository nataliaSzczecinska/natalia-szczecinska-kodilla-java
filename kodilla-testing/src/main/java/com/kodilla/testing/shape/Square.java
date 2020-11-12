package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double squareSideLength;

    public Square(double squareSideLength) {
        this.squareSideLength = squareSideLength;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return squareSideLength * squareSideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.squareSideLength, squareSideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareSideLength);
    }

    @Override
    public String toString() {
        return "Square, " +
                "square side length = " + squareSideLength +
                ", field = " + getField();
    }
}
