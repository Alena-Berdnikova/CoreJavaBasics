package com.perscholas.java_basics;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        System.out.println("task1:2");
        task1(2);
        System.out.println("task1:9");
        task1(9);
        System.out.println("task1:17");
        task1(17);
        System.out.println("task1:88");
        task1(88);
        System.out.println("task2:150");
        task2(150);
        System.out.println("task2:225");
        task2(225);
        System.out.println("task2:1555");
        task2(1555);
        System.out.println("task2:32456");
        task2(32456);
        System.out.println("task3");
        task3();
        System.out.println("task4");
        task4();
        System.out.println("task5");
        task5();
        System.out.println("task6");
        task6();
        System.out.println("task7");
        task7();
    }

    public static void task1(int x) {
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        //decimal
        System.out.println("decimal: " + x);
        //binary
        System.out.println("binary: " + Integer.toBinaryString(x));
    }

    public static void task2(int x) {
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("decimal: " + x);
        System.out.println("binary: " + Integer.toBinaryString(x));
    }

    public static void task3() {
        int x = 7;
        int y = 17;
        int z = x & y;
        System.out.println(z);
    }

    public static void task4() {
        int x = 7;
        int y = 17;
        int z = x | y;
        System.out.println(z);
    }

    public static void task5() {
        int x = 2;
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    public static void task6() {
        int x = 2;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x += 1;
        System.out.println(x);
    }

    public static void task7() {
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println(sum);
        sum = y + x++;
        System.out.println(sum);
    }

}
