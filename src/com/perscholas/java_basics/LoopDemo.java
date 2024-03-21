package com.perscholas.java_basics;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        System.out.println("method1");
        method1();
        System.out.println("sum");
        sum();
        System.out.println("palindrome");
        palindrome();
        System.out.println("pyramid");
        pyramid();
    }

    public static void method1() {
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }

    public static void sum() {
        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }

    public static void palindrome() {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }

    public static void pyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
