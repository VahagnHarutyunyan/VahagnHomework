package com.company.day18.validator;

import com.company.day18.model.Triangle;

public final class TriangleValidator {

    public static boolean isValidTriangleSide(int side) {
        return side > 0 && side < 21;
    }

    public static boolean isValidTriangle(Triangle triangle) {
        if(triangle == null) {
            return false;
        }
        int sideA = triangle.getSideA();
        int sideB = triangle.getSideB();
        int sideC = triangle.getSideC();
        if (
                        sideA + sideB <= sideC ||
                        sideA + sideC <= sideB ||
                        sideB + sideC <= sideA)
        {
            return false;
        }
        return true;
    }

    public static boolean  isTriangleRight(Triangle triangle) {
        if(triangle == null) {
            return false;
        }
        int squareA = triangle.getSideA() * triangle.getSideA();
        int squareB = triangle.getSideB() * triangle.getSideB();
        int squareC = triangle.getSideC() * triangle.getSideC();

        if (
                squareA + squareB == squareC ||
                squareA + squareC == squareB ||
                squareB + squareC == squareA)
        {
            return true;
        }
        return false;
    }
}
