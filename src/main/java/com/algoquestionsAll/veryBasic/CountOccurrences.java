package com.algoquestionsAll.veryBasic;
/*
Day 4: Count Occurrences of a Character
Problem Description:
Write a function to count the number of times a specific character appears in a string.
 */

public class CountOccurrences {

    public static void main(String[] args) {
        String s = "hellollomm";

        System.out.println(countNumberOfOccurrences(s, 'l'));
    }

    public static int countNumberOfOccurrences(String s, char ch){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == ch){
                count++;
            }

        }


        return count;
    }


}
