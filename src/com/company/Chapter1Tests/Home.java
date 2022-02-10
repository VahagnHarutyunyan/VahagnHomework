package com.company.Chapter1Tests;

import java.util.Scanner;

public class Home {

/*
6.	Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
(use Math.abs() for absolute value)

 */



     class A {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                float x = scanner.nextFloat();
                System.out.println(foo(x));
                if (x == 555) break;
            }

        }

        static String foo(float x) {

            if (Math.abs(x) > 1000_000) {
                if (x > 0) {
                    return "positive large";
                } else {
                    return "negative large";
                }
            } else {
                if (Math.abs(x) < 1) {
                    if (x > 0) {
                        return "positive small";
                    } else if (x < 0) {
                        return "negative small";
                    }
                    return "zero";
                } else if (x > 0) {
                    return "positive";
                } else {
                    return "negative";
                }
            }
        }
    }
}
