package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        //sum two integer variables
        int firstInt =1;
        int secondInt =2;
        int sumInt = firstInt+secondInt;
        System.out.println(sumInt);

        //sum two double variables
        double firstDouble =1.9;
        double secondDouble =2.9;
        double sumDouble = firstDouble+secondDouble;
        System.out.println(sumDouble);

        //sum an integer variable and a double variable
        int firstNumber =1;
        double secondNumber =2.9;
        double sum = firstNumber+secondNumber;
        System.out.println(sum);

        //division two integer variables
        int smallerNumber =11;
        int largerNumber =12;
        int divInt = largerNumber/smallerNumber;
        System.out.println(divInt);
        double doubleDiv = largerNumber;
        double result = doubleDiv/smallerNumber;
        System.out.println(result);

        //division two double variables
        double smallerNumberDouble =1.9;
        double largerNumberDouble =2.9;
        double divDouble = largerNumberDouble+smallerNumberDouble;
        System.out.println(divDouble);
        System.out.println((int)divDouble);

        //two integer variables, cast
        int x =5;
        int y =6;
        double q = y/x;
        System.out.println(q);
        q=(double)y;
        System.out.println(q);

        //constant
        final double PI = 3.14159265359;
        System.out.println(4*PI*2*2);

        //cafe
        double coffeePrice = 1.99;
        double cappuccinoPrice = 4.99;
        double espressoPrice = 2.99;
        double subtotal = 3*coffeePrice+ 4*cappuccinoPrice+ 2*espressoPrice;
        final double SALES_TAX = 7.25;
        double totalSale = subtotal+subtotal*SALES_TAX*0.01;
        System.out.println(totalSale);
    }
}
