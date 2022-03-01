package com.company.day18.model;

import static com.company.day18.validator.TriangleValidator.isTriangleRight;
import static com.company.day18.validator.TriangleValidator.isValidTriangle;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public double overloadMethodForSquareOrPerimeter() {
        int a = sideA;
        int b = sideB;
        int c = sideC;
        if (isTriangleRight(this)) {
            double s = (double) (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return a + b + c;
    }

    private boolean isTriangleValid() {
        return isValidTriangle(this);
    }

    public boolean check(Triangle triangle) {
        return isValidTriangle(triangle);
    }
}
