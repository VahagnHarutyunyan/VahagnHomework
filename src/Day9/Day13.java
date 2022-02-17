package Day9;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

//        exerciseOne(); //1.
//        exerciseTwo(x); //2.

    }

    static void exerciseOne() {
        int n = 6;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }


    static void exerciseTwo(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == n - 1 - i) {
                    matrix[i][j] = 1;
                } else if(i + j < n) {
                    matrix[i][j] = 8;
                } else {
                    matrix[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void rotateBy180(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int temp;
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[row - i - 1][col - j - 1];
                matrix[row - i - 1][col - j - 1] = temp;
            }
        }

        if ((row & 1) == 1) {
            for (int j = 0; j < col / 2; j++) {
                temp = matrix[row / 2][j];
                matrix[row / 2][j] = matrix[row / 2][col - j - 1];
                matrix[row / 2][col - j - 1] = temp;
            }
        }

    }

}

