package com.example.arraysAndStrings;
/*
Given an integer array nums, find the contiguous
 subarray (containing at least one number) which has the largest sum and return its sum.
 */

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum2: " + maxSubArray(nums));
    }

    /*
    Kadane's algorithm
     */


    public static int maxSubArray(int[] nums) {
        // Initialize the current and maximum subarray sums as the first element in array
        int currentSum = nums[0];
        int maxSum = nums[0];
        // Loop through the array starting from the second element,
        // as our max is already our first element
        for (int i = 1; i < nums.length; i++){
            // Update the current subarray sum
            currentSum = Math.max(nums[i], currentSum+nums[i]);
            // Update the maximum subarray sum
            maxSum = Math.max(maxSum, currentSum);
        }
        //return maxSum
        return maxSum;
    }
}

