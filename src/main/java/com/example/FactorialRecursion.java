package com.example;
/*
Write a Java program to find the factorial of a number using recursion.
A factorial is a mathematical operation that you write like this: n!.
It represents the multiplication of all numbers between 1 and n.
 */

public class FactorialRecursion {

    public static void main(String[] args){

        System.out.println(findFactorial(6));

    }

    public static int findFactorial(int n){
        if(n<=1) return 1;
        return n*findFactorial(n-1);
    }

}
