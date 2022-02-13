package Day9;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        compareOne(s1, s2);  //1.
//        compareTwo(); //2.
//        signOfValueOne(value); //3.
//        signOfValueTwo(value); //4.
//        ternaryMaxAbs(x, y); // 5.
//        System.out.println(checkString(s)); //6.
//        System.out.println(findMax(x, y, z)); //7.
//        doWhileSwitch(); //9.
//        checkSymbol(x); //10
//        switchExample(x); //10.
//        isNumberEvenorOdd(k); //11.
//        calculator(); //12.
//        weekDay(scanner.nextInt()); //13.


    }


    static void compareOne(String str1, String str2) {
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }

    static void compareTwo() {
        String str1 = "Hello111";
        String str2 = new String("Hello111");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }

    static void signOfValueOne(int num) {
        if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    static void signOfValueTwo(int num) {
        if (num > 0) {
            System.out.println("positive");
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println("negative");
        }
    }

    static void ternaryMaxAbs(int a, int b) {
        System.out.println("max: " + (a > b ? a : b));
        System.out.println("\nabs: " + (a > 0 ? a : -a));
    }

    static int checkString(String str) {
        return str == null ? -1 : str.equals(" ") ? 0 : 1;
    }

    static int findMax(int a, int b, int c) {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    static void doWhileSwitch() {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.println(

                    "       What is the correct way to declare a variable to store an integer value in Java ?\n" +
                            "        a. int 1 x = 10;\n" +
                            "        b. int x = 10;\n" +
                            "        c. float x = 10.0f;\n" +
                            "        d.string x = \"10\";\n" +
                            "        Enter your choice:\n" +
                            "        Enter \"quit\" to quit program");
            str = sc.nextLine();
            switch (str) {
                case "a":
                    System.out.println("Invalide choice");
                    break;
                case "b":
                    System.out.println("Congratulation");
                    break;
                case "c":
                    System.out.println("Invalide choice");
                    break;
                case "d":
                    System.out.println("Invalide choice");
                    break;
                default:
                    if (!str.equals("quit")) {
                        System.out.println("There are not default choice :-)");
                    }
                    break;
            }
        } while (!str.equals("quit"));
        sc.close();
    }

    static void checkSymbol(char a) {
        switch (a) {
            case 'a':
                System.out.println(a + " is a vowel");
                break;
            case 'b':
                System.out.println(a + " is a consonant");
                break;
            case 'c':
                System.out.println(a + " is a consonant");
                break;
            case 'd':
                System.out.println(a + " is a consonant");
                break;
            case 'e':
                System.out.println(a + " is a vowel");
                break;
            case 'f':
                System.out.println(a + " is a consonant");
                break;
            case 'g':
                System.out.println(a + " is a consonant");
                break;
            case 'h':
                System.out.println(a + " is a consonant");
                break;
            default:
                System.out.println("There are not default choice");

        }
    }

    static void switchExample(char a) {
        switch (a) {
            case '0':
                System.out.println(0);
                break;
            case '1':
                System.out.println(1);
                break;
            case '2':
                System.out.println(2);
                break;
            case '3':
                System.out.println('3');
                break;
            case '4':
                System.out.println('4');
                break;
            case '5':
                System.out.println("5");
                break;
            case '6':
                System.out.println("6");
                break;
            case '7':
                System.out.println(7);
                break;
            case '8':
                System.out.println(8);
                break;
            case '9':
                System.out.println(9);
                break;
            default:
                System.out.println("Not allowed");

        }
    }

    static void isNumberEvenorOdd(int n) {
        switch (n % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }

    static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double k = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double p = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /)");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(k + " + " + p + ": " + (k + p));
                break;
            case '-':
                System.out.println(k + " - " + p + ": " + (k - p));
                break;
            case '/':
                System.out.println(k + " / " + p + ": " + (k / p));
                break;
            case '*':
                System.out.println(k + " * " + p + ": " + (k * p));
                break;
            default:
                System.out.println("Error");
        }
    }

    static void weekDay(int a) {
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("There are not default choice");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

}
