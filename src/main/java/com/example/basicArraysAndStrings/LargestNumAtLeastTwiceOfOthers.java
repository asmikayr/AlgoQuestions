package com.example.basicArraysAndStrings;
/*
Problem Description:
Given an integer array nums, find whether the largest element in the array is at least twice as much
as every other number in the array. If it is, return the index of the largest element, otherwise,
return -1.
 */

public class LargestNumAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};

        System.out.println(isTwiceOfOthers(nums));

    }

    public static int isTwiceOfOthers(int[] nums){
        int max = nums[0];
        int maxInd = 0;

        for (int i = 0; i < nums.length; i++) {
                if(nums[i] > max){
                    max = nums[i];
                    maxInd = i;
                }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxInd && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxInd;
    }
}
