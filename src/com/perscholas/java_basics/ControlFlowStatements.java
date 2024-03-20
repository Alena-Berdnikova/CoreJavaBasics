package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {
        System.out.println("method1");
        method1(7);
        method1(15);

        System.out.println("method2");
        method2(7);
        method2(15);

        System.out.println("method3");
        method3(15);
        method3(50);

        System.out.println("method4");
        method4(15);
        method4(5);

        System.out.println("method5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        method5(x);
        scanner.close();

        System.out.println("method6");
        method6(3);

        System.out.println("method7");
        System.out.println(method7(FillingStatus.SINGLE, 5000));
        System.out.println(method7(FillingStatus.MARRIED_FILLING_JOINTLY, 50000));
        System.out.println(method7(FillingStatus.MARRIED_FILLING_SEPARATELY, 65000));
        System.out.println(method7(FillingStatus.HEAD_OF_HOUSEHOLD, 190000));
        System.out.println(method7(FillingStatus.SINGLE, 300000));
        System.out.println(method7(FillingStatus.MARRIED_FILLING_JOINTLY, 400000));
    }

    public static void method1(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

    public static void method2(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    public static void method3(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }

    public static void method4(int x) {
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
    }

    public static void method5(int x) {
        if (x >= 90 && x <= 100) {
            System.out.println("A");
        } else if (x >= 80 && x < 90) {
            System.out.println("B");
        } else if (x >= 70 && x < 80) {
            System.out.println("C");
        } else if (x >= 60 && x < 70) {
            System.out.println("D");
        } else if (x >= 0 && x < 60) {
            System.out.println("F");
        } else {
            System.out.println("Score out of range");
        }
    }

    public static void method6(int x) {
        switch (x) {
            case 1:
                System.out.println("Monday");
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
            default:
                System.out.println("Out of range");
                break;
        }
    }

    public static double method7(FillingStatus status, int income) {
        double tax = 0;
        switch (status) {
            case SINGLE:
                if (income <= 8350) {
                    return income * 0.1;
                }
                tax += 8350 * 0.1;
                if (income <= 33950) {
                    return (income - 8350) * 0.15 + tax;
                }
                tax += (33950 - 8350) * 0.15;
                if (income <= 82250) {
                    return (income - 33950) * 0.25 + tax;
                }
                tax += (82250 - 33950) * 0.25;
                if (income <= 171550) {
                    return (income - 82250) * 0.28 + tax;
                }
                tax += (171550 - 82250) * 0.28;
                if (income <= 372950) {
                    return (income - 171550) * 0.33 + tax;
                }
                tax += (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                break;
            case MARRIED_FILLING_JOINTLY:
                if (income <= 16700) {
                    return income * 0.1;
                }
                tax += 16700 * 0.1;
                if (income <= 67900) {
                    return (income - 16700) * 0.15 + tax;
                }
                tax += (67900 - 16700) * 0.15;
                if (income <= 137050) {
                    return (income - 67900) * 0.25 + tax;
                }
                tax += (137050 - 67900) * 0.25;
                if (income <= 208850) {
                    return (income - 137050) * 0.28 + tax;
                }
                tax += (208850 - 137050) * 0.28;
                if (income <= 372950) {
                    return (income - 208850) * 0.33 + tax;
                }
                tax += (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
                break;
            case MARRIED_FILLING_SEPARATELY:
                if (income <= 8350) {
                    return income * 0.1;
                }
                tax += 8350 * 0.1;
                if (income <= 33950) {
                    return (income - 8350) * 0.15 + tax;
                }
                tax += (33950 - 8350) * 0.15;
                if (income <= 68525) {
                    return (income - 33950) * 0.25 + tax;
                }
                tax += (68525 - 33950) * 0.25;
                if (income <= 104425) {
                    return (income - 68525) * 0.28 + tax;
                }
                tax += (104425 - 68525) * 0.28;
                if (income <= 186476) {
                    return (income - 104425) * 0.33 + tax;
                }
                tax += (186476 - 104425) * 0.33 + (income - 186476) * 0.35;
                break;
            case HEAD_OF_HOUSEHOLD:
                if (income <= 11950) {
                    return income * 0.1;
                }
                tax += 11950 * 0.1;
                if (income <= 45500) {
                    return (income - 11950) * 0.15 + tax;
                }
                tax += (45500 - 11950) * 0.15;
                if (income <= 117450) {
                    return (income - 45500) * 0.25 + tax;
                }
                tax += (117450 - 45500) * 0.25;
                if (income <= 190200) {
                    return (income - 117450) * 0.28 + tax;
                }
                tax += (190200 - 117450) * 0.28;
                if (income <= 372950) {
                    return (income - 190200) * 0.33 + tax;
                }
                tax += (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
                break;
        }
        return tax;
    }

    public enum FillingStatus {
        SINGLE,
        MARRIED_FILLING_JOINTLY,
        MARRIED_FILLING_SEPARATELY,
        HEAD_OF_HOUSEHOLD
    }
}
