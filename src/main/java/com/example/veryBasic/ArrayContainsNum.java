package com.example.veryBasic;
/*
Day 6: Check if Array Contains a Number
Problem Description:
Write a function to check if a specific number is present in an array.
 */
public class ArrayContainsNum {

    public static void main(String[] args) {
        int[] nums = {5,9,13,27,5,98};

        System.out.println(isContainingN(nums, 11));

    }

    public static boolean isContainingN(int[] nums, int n){
        for (int num : nums) {
            if (num == n) return true;
        }
        return false;
    }
}
