package com.example.veryBasic;

/*
Day 6: Running Sum of 1d Array
Problem Description:
Given an array nums, return an array runningSum where runningSum[i] is the sum of nums[0] to nums[i].
 */

import java.util.Arrays;

public class RunningSumOf1DArr {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(getRunningSum(nums)));
    }

    public static int[] getRunningSum(int[] nums){
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;

        }

        return result;

    }
}
