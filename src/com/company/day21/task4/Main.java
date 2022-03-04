package com.company.day21.task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setA(3);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(10.5, 20);

        Shape[] shapes = new Shape[3];
        shapes[0] = square;
        shapes[1] = circle;
        shapes[2] = rectangle;
        print(shapes);
    }

    private static void print(Shape[] sh) {
        for (Shape x : sh) {
            System.out.println(x.area());
            System.out.println(x.perimeter());
            System.out.println("--------------");
        }
    }
}
