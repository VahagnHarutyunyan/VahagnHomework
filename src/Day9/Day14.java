package Day9;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
//        System.out.println(task1("oou ui")); //1
//        System.out.println(task2("12345678", 2)); //2
//        System.out.println(task3("13452678", '2')); //3
//        System.out.println(task4("sdlppoicnvbsjznckaasloa")); //4
//        reverseString(); //5
        countVowelsDigits("testing12345");



    }

    static int task1(String str) {
        return str.length();
    }

    static char task2(String str, int index) {
        return str.charAt(index);
    }

    static boolean task3(String str, char ch) {
        return str.indexOf(ch) != -1;
    }

    static int task4(String str) {
        String s = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (s.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        String str = stringBuilder.toString();
        System.out.println(str);
        scanner.close();
    }
    static void countVowelsDigits(String str) {
        int vowelsCount = 0;
        int digitsCount = 0;

    }

}
