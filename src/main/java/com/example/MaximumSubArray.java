package com.example;
/*
Given an integer array nums, find the contiguous
 subarray (containing at least one number) which has the largest sum and return its sum.
 */

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

