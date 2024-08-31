package com.algoquestionsAll.veryBasic;

/*
Day 1: Find the Largest Number
Problem Description:
Write a function to find the largest number in an array.
 */

public class FindTheLargestNumberInArray {


    public static void main(String[] args) {
        int[] nums = {3,5,7,2,8};

        System.out.println(findLargestNumber(nums));

    }

    public static int findLargestNumber(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }



}
