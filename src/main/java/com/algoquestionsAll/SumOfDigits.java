package com.algoquestionsAll;
/*
Question-2 Sum of Digits
Given n, take the sum of the digits of n, if that value has more than one digit, continue reducing in this way until
a single-digit number is produced.
Examples:
16 🡪 1 + 6 = 7
942 🡪 9 + 4 + 2 = 15 🡪 1 + 5 🡪 6
132189 🡪 1 + 3 + 2 + 1 + 8 + 9 + 24 🡪 2 + 4 = 6
493193 🡪 4 + 9 + 3 + 1 + 9 + 3 = 29 🡪 2 + 9 = 11 🡪 1 + 1 = 2
Constraints: The input will be a non-negative integer.

 */

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(getSumOfNum(123));
        System.out.println(getSumOfNum(9));
        System.out.println(getSumOfNum(1997));
        System.out.println(getSumOfNumByDigitRoot(123));
        System.out.println(getSumOfNumByDigitRoot(9));
        System.out.println(getSumOfNumByDigitRoot(1997));

    }

    public static int getSumOfNum(int n){
        if (n<=9) return n;
        int sum = 0;

        while(n>9){
            sum += n%10;
            n /= 10;
        }

        sum += n;

        if(sum > 9) return getSumOfNum(sum);

        return sum;

    }

    public static int getSumOfNumByDigitRoot(int n){
        if(n == 0) return 0;
        return 1+(n-1)%9;
    }
}
