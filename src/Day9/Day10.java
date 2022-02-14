package Day9;

import java.util.Random;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

//        printOne(); //1
//        printTwo(); //2
//        squarsOfNaturalNumbers(x); //3
//        smallestNaturalDivisor(x); //4
//        integerPowerofTwo(x); //5
//        printDescending(x); //6
//        printMultiple(x); //7
//        isTheExactPowerOfTwo(); //8
//        smallestInteger(x); //9
//        ascii(); //10
//        printIntegers(x); //11
//        fibonacci(); //12
//        athlete(); //13
//        bank(); //14
//        secondLargestElement(); //15
//        guessTheNumber(); //16
//        computeTheSum(x); //17


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

    static void smallestInteger(int n) {
        int k = 1;
        int count = 0;
        while (true) {
            k = k * 2;
            if (k >= n) {
                break;
            }
        }
        while (n != 0) {
            n = n >> 1;
            count++;
        }
        System.out.println(count + "\t\t" + k);
    }

    static void ascii() {
        int i = 32;
        while (i <= 122) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print((char) i);
            i++;
        }
    }

    static void printIntegers(int n) {
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    static void fibonacci() {
        int temp;
        int count = 0;
        int A = 55;
        int fib1 = 0;
        int fib2 = 1;

        while (fib1 < A) {
            temp = fib1;
            fib1 = fib2;
            fib2 = fib2 + temp;
            System.out.print(fib1 + " ");
            count++;
        }
        if (fib1 == A) {
            System.out.println("\n" + count);
        } else {
            System.out.println("\n" + -1);
        }
    }

    static void athlete() {
        float x = 100;
        float y = 200;
        int count = 0;

        while (x < y) {
            x = (float) 1.1 * x;
            count++;
            System.out.print(x + "\t");
        }
        System.out.println("\n" + count);

    }

    static void bank() {
        float x = 100;
        float p = 10;
        float y = 200;
        int count = 0;

        while (x < y) {
            x = x + p / 100 * x;
            x = (int) x;
            count++;
            System.out.print(x + "\t");
        }
        System.out.println("\n" + count);
    }

    static void secondLargestElement() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int second = 0;
        int i;
        while (true) {
            i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            if (i > max) {
                second = max;
                max = i;
            } else if (i > second) {
                second = i;
            }
        }
        System.out.println(second);
    }

    static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(20);
        int number;
        System.out.println("Can you guess what the number is");

        while (true) {
            number = scanner.nextInt();
            if (number > rand) {
                System.out.println("Too high, try again");
            } else if (number < rand) {
                System.out.println("Too low, try againToo low, try again");
            } else {
                System.out.println("Yes, you guessed the number");
                break;
            }
        }
    }

    static void computeTheSum(int n) {
        int sum = 0;
        while (n > 0) {
            n = n / 10;
            sum++;
        }
        System.out.println(sum);
    }
}
