package day18;


public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    private boolean isTriangleValid() {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            return false;
        }
        return true;
    }

    public boolean check(Triangle triangle) {
        return triangle.isTriangleValid();
    }

    public boolean isTriangleRight(Triangle triangle) {
        int squareA = sideA * sideA;
        int squareB = sideB * sideB;
        int squareC = sideC * sideC;

        if (
                squareA + squareB == squareC
                        ||
                        squareA + squareC == squareB
                        ||
                        squareB + squareC == squareA
        ) {
            return true;
        }
        return false;
    }

    public double overloadMethodForSquareOrPerimeter(Triangle triangle) {
        int a = triangle.getSideA();
        int b = triangle.getSideB();
        int c = triangle.getSideC();
        if (triangle.isTriangleRight(triangle)) {
            double s = (double) (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return a + b + c;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("sideA must be in range 1-20");
            return;
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 1 || sideB > 20) {
            System.out.println("sideB must be in range 1-20");
            return;
        }
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 1 || sideC > 20) {
            System.out.println("sideC must be in range 1-20");
            return;
        }
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }
}
