package com.example;
/*
Check if a Number is Prime: Write a Java program to determine
 if a given number is a prime number.
 */

public class IsAPrimeNumber {
    public static void main(String[] args) {
        System.out.println(isAPrimeNumber(6));
    }

    public static boolean isAPrimeNumber(int num){
        if(num != 1){
            int i = num-1;
           while(i != 1){
               if(num % i == 0) return false;
               i--;
           }
           return true;
        }

        return false;
    }

    public static boolean isAPrimeNumber2(int num) {
        // Check if the number is less than 2
        if (num <= 1) {
            return false;
        }

        // Check if the number is 2, the smallest prime number
        if (num == 2) {
            return true;
        }

        // Check if the number is even (and not 2)
        if (num % 2 == 0) {
            return false;
        }

        // Check for factors from 3 up to the square root of the number
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        // If no factors are found, the number is prime
        return true;
    }
}
