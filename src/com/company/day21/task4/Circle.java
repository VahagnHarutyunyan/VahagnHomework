package com.company.day21.task4;

public class Circle implements Shape {
    private final double radius = 2.5;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
