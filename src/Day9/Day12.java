package Day9;

import java.util.Random;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int x = scanner.nextInt();


//        exerciseOne(x); //1.
//        exerciseTwo(x); //2.
        int[] array = new int[10]; //3.
//        numberOfPositive(array); //3.
//        exerciseFour(); //4.
//        adjacentElement(array); //5.
        largestAndIndex();//6


    }

    static void exerciseOne(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void exerciseTwo(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void numberOfPositive(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid");
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -100 + rand.nextInt(200);
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int k : arr) {
            if (k > 0) {
                System.out.print(k + " ");
            }
        }
    }

    static void exerciseFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Input " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void adjacentElement(int[] masiv) {
        if (masiv == null || masiv.length == 0) {
            System.out.println("Invalid");
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = -100 + rand.nextInt(200);
        }
        for (int k : masiv) {
            System.out.print(k + "   ");
        }
        System.out.println();
        for (int i = 0; i < masiv.length - 1; i++) {
            if (masiv[i] * masiv[i + 1] > 0) {
                System.out.print(masiv[i] + " " + masiv[i + 1]);
                return;
            }
        }
    }

    /**
     * 6. An array of numbers is given. Print the value of the largest element in the array,
     * and then the index of that element in the array. If there are several largest elements,
     * print the index of the first of them.
     * Example` Input` 1 2 3 2 1
     * Output` The largest is 3    index is 2
     */
    static void largestAndIndex() {
        int[] arr = {1, 2, 3, 5, 4, 22, 33, -10, 2, -20};

    }
}
