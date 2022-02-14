package Day9;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();

//        printOne(); //1
//        printTwo(); //2
//        squarsOfNaturalNumbers(x); //3
//        smallestNaturalDivisor(x); //4
//        integerPowerofTwo(x); //5
//        printDescending(x); //6
//        printMultiple(x); //7
        isTheExactPowerOfTwo();


    }

    static void printOne() {
        int i = 0;
        while (++i <= 10) {
            System.out.println(i);
        }
    }

    static void printTwo() {
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }

    static void squarsOfNaturalNumbers(int n) {
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }

    static void smallestNaturalDivisor(int n) {
        int k = (int) Math.sqrt(n);
        int i = 2;

        while (i <= k) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    static void integerPowerofTwo(int n) {
        int i = 2;
        while (i <= n) {
            System.out.println(i);
            i *= 2;
        }
    }

    static void printDescending(int n) {
        while (n >= -1000) {
            System.out.println(n--);
        }
    }

    static void printMultiple(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }

    static void isTheExactPowerOfTwo() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int count = 0;

        while (true) {
            x = scanner.nextInt();
            count++;
            if (foo(x)) {
                System.out.println(x + "\t" + count);
                break;
            }
        }
    }
    static boolean foo(int k) {
        return (k & k - 1) == 0;
    }
}
