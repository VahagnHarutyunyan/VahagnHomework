package Day9;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(task1("oou ui")); //1
//        System.out.println(task2("12345678", 2)); //2
//        System.out.println(task3("13452678", '2')); //3
//        System.out.println(task4("sdlppoicnvbsjznckaasloa")); //4
//        reverseString(); //5

//        System.out.print("Enter a String: ");

//        countVowelsDigits(s); //6
//        System.out.print("Enter a plaintext string: ");
//        String s = scanner.nextLine();
//        System.out.print("Enter distance: ");
//        int distance = scanner.nextInt();
//        System.out.println(caesarCode(s, distance)); //7
//        System.out.println(checkPalindrome(s)); //8
//        System.out.println(checkBinStr(s)); //9
//        System.out.println(task10(s)); //10
//        bin2Dec(); // 11
//        task12(); //12
//        task13(); //13
//
//
//        scanner.close();
    }

    static int task1(String str) {
        return str.length();
    }

    static char task2(String str, int index) {
        if (index < 0 || index > str.length() - 1) {
            return ' ';
        }
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
        int vowelsCount = countVowels(str);
        int digitsCount = countDigits(str);
        System.out.printf("Number of vowels: " + vowelsCount + "\t\t" + (float) vowelsCount * 100 / str.length() + "\n");
        System.out.println("Number of digits: " + digitsCount + "\t\t" + (float) digitsCount * 100 / str.length());

    }

    static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }

    static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.toLowerCase().charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    static String caesarCode(String str, int distance) {
        String newStr = "";
        char letter;
        for (int i = 0; i < str.length(); i++) {
            letter = str.toUpperCase().charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + distance);
            }
            if (letter > 'Z') {
                letter = (char) ('A' - 'Z' - 1 + letter);
            }
            newStr += letter;
        }

        return newStr;
    }

    static boolean checkPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    static boolean checkBinStr(String str) {
        if (str.length() % 8 != 0 || !foo(str)) {
            return false;
        }
        return true;
    }

    static boolean foo(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    static boolean task10(String str) {
        for (char ch : str.toUpperCase().toCharArray()) {
            if (ch < '0' || ch > 'F' || (ch > '9' && ch < 'A')) {
                return false;
            }
        }
        return true;
    }

    static void bin2Dec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String str = scanner.nextLine();
        scanner.close();
        if (!checkBinStr(str)) {
            System.out.println("error: invalid binary string " + str);
            return;
        }
        int p = 1;
        int sum = 0;
        char one = '1';
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == one) {
                sum += p;
            }
            p *= 2;
        }
        System.out.println(sum);

    }

    static void task12() {
        String str = "123452111";
        int count = 0;
        int countTemp;

        for (int i = 0; i < str.length() - 1; i++) {
            countTemp = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    countTemp++;
                }
            }
            if (countTemp == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void task13() {
        String str = "444441123452333";

        for (int i = 0; i < str.length(); i++) {
            boolean bool = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    bool = true;
                    break;
                }
            }
            if (!bool) {
                System.out.print(str.charAt(i));
                break;
            }
        }
    }

}
