package com.algoquestionsAll.recursion;
/*
Write a Java program to print the Fibonacci series up to a given number.
In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
 */

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println(getFibonacciSeries(5));

    }

    public static int getFibonacciSeries(int n){
        if (n <= 1) return 1;
        return getFibonacciSeries(n-1)+getFibonacciSeries(n-2);
    }
}
