package com.example.veryBasic;
/*
Day 7: Print Even Numbers from 1 to N
Problem Description:
Write a function to print all even numbers from 1 to N.
 */

public class PrintEvenNums{
    public static void main(String[] args) {
        printEvenNumbers(10);
    }

    public static void printEvenNumbers(int n){
        for (int i = 0; i <= n; i++) {
            if(i%2==0) System.out.println(i);
        }
    }
}
