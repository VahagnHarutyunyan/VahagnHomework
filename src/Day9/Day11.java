package Day9;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


//        printEvenFromRange(x, y); //1.
//        numbersOnSegmentOne(x, y, k, m); //2.
//        numbersOnSegmentSquares(x, y); //3.
//        exerciseFour(x, y);//4.
//        reverse(x); //5.
//        System.out.println(smallestNaturalDivisor(x)); //6.
//        printAllNaturalDivisors(x); //7.
//        System.out.println(countOfNaturalDivisors(x)); //8.
//        System.out.println(sumOf10Numbers()); //9.
//        binaryToDecimalConverter(x); //10.
//        exercise11(); //11.
//        sequence(x); //12.
//        matrix13(x); //13.
//        matrix14(x); //14.



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

    static void reverse(int x) {
        int reverse = 0;
        for (int i = x; i > 0; i = i / 10) {
            reverse = reverse * 10 + i % 10;
        }
        System.out.println(reverse);
    }

    static int smallestNaturalDivisor(int x) {
        if (x % 2 == 0) {
            return 2;
        }
        double sqrt = Math.sqrt(x);
        for (int i = 3; i <= sqrt; i++) {
            if (x % i == 0) {
                return i;
            }
        }
        return x;
    }

    static void printAllNaturalDivisors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //x≤2 ∗ 109 harcnem te incha nshanakum

    static int countOfNaturalDivisors(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count;
    }

    static int sumOf10Numbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scanner.nextInt();
        }
        return sum;
    }

    static void binaryToDecimalConverter(int x) {
        int result = 0;
        int p = 0;
        for (int i = x; i > 0; i = i / 10) {
            result += i % 10 * Math.pow(2, p);
            p++;
        }
        System.out.println(result);
    }

    static void exercise11() {
        Scanner scanner = new Scanner(System.in);
        int zeros = 0;
        int positive = 0;
        int negative = 0;
        System.out.println("Enter number");
        int N = scanner.nextInt();
        System.out.println("Now " + N + " time enter number");
        for (int i = 0; i < N; i++) {
            int input = scanner.nextInt();
            if (input == 0) {
                zeros++;
            } else if (input > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("zero: " + zeros + "\n" + "positive: " + positive + "\n" + "negative: " + negative);
    }

    static void sequence(int x) {
        int count = 0;
        for (int i = 1; i < 1000000; i++) {

            for (int j = 0; j < i; j++) {
                if (count == x) {
                    return;
                }
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }

    static void matrix13(int N) {

        int[][] matrix13 = new int[N][];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print('*' + "  ");
            }
            System.out.println();
        }
    }

    static void matrix14(int N) {
        int[][] matrix14 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

 /*               if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print("   ");
                    }
                } else if (j % 2 != 0) {
                    System.out.print("#");
                } else {
                    System.out.print("   ");
                }
            }
  */

                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print("#");
                } else {
                    System.out.print("   ");
                }
            }
            if (i == 0) {
                System.out.print("\t\t\t\t" + N + " * " + N);
            }
            System.out.println();
        }
    }

}

