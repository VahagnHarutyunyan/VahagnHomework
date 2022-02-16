package Day9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int x = scanner.nextInt();
//        int[] array = new int[10];
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            array[i] = -100 + rand.nextInt(200);
//        }


//        exerciseOne(x); //1.
//        exerciseTwo(x); //2.
//        numberOfPositive(array); //3.
//        exerciseFour(); //4.
//        adjacentElement(array); //5.
//        largestAndIndex();//6
//        smallestPositive(); //7
//        different(); //8
//        reverseWithoutChange(); //9.
//        reverseRearrange(); //10.
//        adjacentElementsRearrange(); //11.
//        cycle(); //12.
//        swapMinMax(); //13.
//        arrayWithIndexK(array, 4);

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

    static void largestAndIndex() {
        int[] arr = {1, 2, 3, 5, 4, 22, 33, -10, 50, -20};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("max: " + max + "\t\t" + "maxIndex: " + maxIndex);

    }

    static void smallestPositive() {
        int[] arr = {-2, 5, 4, -6, 8, 20, 10, 2};
        int small = arr[0];
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] > 0) {
                small = arr[i];
                break;
            }
        }
        for (; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("smallest positive: " + small);
    }

    static void different() {
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 8, 11, 11, 11};
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i - 1] + " -> " + arr[i]);
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    static void reverseWithoutChange() {
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 8, 11, 11, 11};
        int size = arr.length - 1;
        for (int i = size; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverseRearrange() {
        int[] arr = {1, 2, 34, 5, 6, 7, 8, 9, -12};
        int size = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;
            size--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }


    static void adjacentElementsRearrange() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void cycle() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void swapMinMax() {
        int[] arr = {1, 2, 3, 14, 5, -3, 7};
        int min = arr[0];
        int max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            } else if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("min: " + min + "\t\tmax: " + max);
        int temp = arr[indexMin];
        arr[indexMin] = arr[indexMax];
        arr[indexMax] = temp;
        for (int k : arr) {
            System.out.print(k + " ");
        }

    }

    static void arrayWithIndexK(int[] arr, int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid");
            return;
        }

        int k = arr[index];
        for (int p : arr) {
            System.out.print(p + " ");
        }
        System.out.println("\n" + arr[index]);
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = Integer.MAX_VALUE;
        for (int p : arr) {
            System.out.print(p + " ");
        }
    }
}
