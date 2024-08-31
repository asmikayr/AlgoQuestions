package com.algoquestionsAll.veryBasic;

/*
Day 3: Sum of Array Elements
Problem Description:
Write a function to find the sum of all elements in an array.
 */

public class FindTheSumOfAllNums {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,7};

        System.out.println(findSumOfNums(nums));


    }

    public static int findSumOfNums(int[] nums){
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

}
