package Day9;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
       // int y = scanner.nextInt();
//        int k = scanner.nextInt();
//        int m = scanner.nextInt();


//        printEvenFromRange(x, y); //1.
//        numbersOnSegmentOne(x, y, k, m); //2.
//        numbersOnSegmentSquares(x, y); //3.
//        exerciseFour(x, y);//4.
        reverse(x);

    }

    static void printEvenFromRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void numbersOnSegmentOne(int a, int b, int c, int d) {
        if (d == 0) {
            System.out.println("d can not be 0");
            return;
        }
        for (int i = a; i < b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }

    static void numbersOnSegmentSquares(int a, int b) {
        for (int i = a; i < b; i++) {
            //if (Math.sqrt(i) == (int) Math.sqrt(i))
            if (isSquare(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isSquare(int k) {
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (i * i == k) {
                return true;
            }
        }
        return false;
    }

    static void exerciseFour(int x, int d) {
        int count = 0;
        for (int i = x; i > 0; i = i / 10) {
            if (i % 10 == d) {
                count++;
            }
        }
        System.out.println(count);
    }
    /**
     * Given an integer number x
     * Print the number consisting of the digits of the given number x in reverse order.
     * You do not need to output leading zeros.
     */

    static void reverse(int x) {
        for(int i = x; i > 0; i = i / 10) {

        }
    }
}
