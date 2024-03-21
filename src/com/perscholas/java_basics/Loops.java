package com.perscholas.java_basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        multiplicationTable();
        System.out.println("Greatest Common Divisor");
        greatestCommonDivisor();
        System.out.println("Predict Future Tuition");
        predictFutureTuition();
    }

    public static void multiplicationTable() {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                int multipl = i * j;
                if (multipl < 10) {
                    System.out.print("  ");
                } else if (multipl < 100) {
                    System.out.print(" ");
                }
                System.out.print(" " + multipl);
            }
            System.out.println();
        }
    }

    public static void greatestCommonDivisor() {
        System.out.println("Enter two positive integers");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (firstNumber <= 0 || secondNumber <= 0) {
            System.out.println("Number should be positive");
            return;
        }
        int div = 1;
        for (int i = 2; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                div = i;
            }
        }
        System.out.printf("Greatest Common Divisor for %d and %d is %d", firstNumber, secondNumber, div);
        System.out.println();
    }

    public static void predictFutureTuition() {
        int tuition = 10000;
        int doubledTuition = 2 * tuition;
        int numberYears = 0;
        while (tuition < doubledTuition) {
            numberYears++;
            tuition = (int) (tuition * 1.07);
        }
        System.out.printf("The tuition will be doubled in %d years", numberYears);
    }
}
