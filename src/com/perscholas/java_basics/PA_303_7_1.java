package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class PA_303_7_1 {
    public static void main(String[] args) {
        System.out.println("Task ");
        task1();
        System.out.println("Task 2");
        task2();
        System.out.println("Task 3");
        task3();
        System.out.println("Task 4");
        task4();
        System.out.println("Task 5");
        task5();
        System.out.println("Task 6");
        task6();
        System.out.println("Task 7");
        task7();
        System.out.println("Task 8");
        task8();
        System.out.println("Task 9");
        task9();
        System.out.println("Task 10");
        task10();
        System.out.println("Task 11");
        task11();
    }
    public static void task1(){
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void task2(){
        int[] array =  {13, 5, 7, 68, 2};
        System.out.println(array[array.length/2]);
    }
    public static void task3(){
        String[] array = {"red,", "green,", "blue,", "yellow."};
        System.out.println(array.length);
        String[] arrayClone = array.clone();
        System.out.println(Arrays.toString(arrayClone));
    }
    public static void task4(){
        int[] array = {3,56,2,678,4};
        System.out.println("first: "+array[0]);
        System.out.println("last: "+ array[array.length-1]);
        //Exception - java.lang.ArrayIndexOutOfBoundsException
        //System.out.println("last: "+ array[array.length]);
        //Exception - java.lang.ArrayIndexOutOfBoundsException
        //System.out.println("last: "+ array[5]);
    }
    public static void task5(){
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void task6(){
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i*2;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void task7(){
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            if(i!=2){
                System.out.println(array[i]);
            }
        }
    }
    public static void task8(){
        String[] array = {"first", "second", "third", "fourth", "fifth"};
        String temp = array[0];
        array[0] = array[array.length/2];
        array[array.length/2] = temp;
        System.out.println(Arrays.toString(array));
    }
    public static void task9(){
        int[] array ={4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.println("Array in ascending order: "+ Arrays.toString(array));
        System.out.println("The smallest number is "+array[0]);
        System.out.println("The biggest number is "+array[array.length-1]);
    }
    public static void task10(){
        Object [] array = {3, "first", "second", "third", 2.5};
        System.out.println(Arrays.toString(array));
    }
    public static void task11(){
        System.out.println("How many favorite things do you have?");
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[scanner.nextInt()];
        for(int i=0;i< array.length;i++){
            System.out.print("Enter your thing: ");
            array[i] = scanner.next();
        }
        System.out.println("Your favorite  things are:");
        for (String s:array){
            System.out.print(s+" ");
        }
        scanner.close();
    }
}
