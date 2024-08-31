package com.algoquestionsAll;
/*
Write a Java method to reverse a string.
 */

public class ReverseString {

    public static void main(String[] args) {
        String str = " Hello world again ";

        System.out.println(reverseString(str));
        System.out.println(reverse(str));

    }

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
