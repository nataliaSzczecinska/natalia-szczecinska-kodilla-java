package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private double triangleSide1;
    //private double triangleSide2;
    //private double triangleSide3;
    private double triangleHightLength1;
    //private double triangleHightLength2;
    //private double triangleHightLength3;

    public Triangle (double triangleSide1, double triangleHightLength1) {
        this.triangleSide1 = triangleSide1;
        this.triangleHightLength1 = triangleHightLength1;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5 * triangleHightLength1 * triangleSide1;
    }

    @Override //to nie do końca tak, ale na ten moment niech tak zostanie
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return Double.compare(triangle.triangleSide1, triangleSide1) == 0 &&
                Double.compare(triangle.triangleHightLength1, triangleHightLength1) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(triangleSide1, triangleHightLength1);
    }

    @Override
    public String toString() {
        return "Triangle, " +
                "triangle side length = " + triangleSide1 +
                ", triangle high length = " + triangleHightLength1 +
                ", field = " + getField();
    }
}
