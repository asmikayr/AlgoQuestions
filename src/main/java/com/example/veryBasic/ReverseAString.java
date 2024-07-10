package com.example.veryBasic;
/*
Day 1: Reverse String
Problem Description:
Write a function that reverses a string. The input string is given as an array of characters s.
 */

public class ReverseAString {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars);

        System.out.println(reverseCharArray(chars));

    }

    public static char[] reverseCharArray(char[] chars){
        int left = 0;
        int right = chars.length-1;

        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return chars;
    }
}
