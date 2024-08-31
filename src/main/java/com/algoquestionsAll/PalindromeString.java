package com.algoquestionsAll;

/*
Write a Java program to check if a string is a palindrome.
 */

public class PalindromeString {

    public static void main(String[] args) {
        String word = "rabar";

        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while(start>end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
