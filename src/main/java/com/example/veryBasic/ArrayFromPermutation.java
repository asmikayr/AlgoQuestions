package com.example.veryBasic;

/*
Day 4: Build Array from Permutation
Problem Description:
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
for each 0 <= i < nums.length. Return the array ans.
 */

import java.util.Arrays;

public class ArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(getArrayFromPermutation(nums)));
    }

    public static int[] getArrayFromPermutation(int[] nums){
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length ; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
