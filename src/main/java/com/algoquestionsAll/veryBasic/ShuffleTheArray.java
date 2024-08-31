package com.algoquestionsAll.veryBasic;
/*
Day 5: Shuffle the Array
Problem Description:
Given the array nums consisting of 2n elements in the form [x1, x2, ..., xn, y1, y2, ..., yn],
return the array in the form [x1, y1, x2, y2, ..., xn, yn].
 */

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};

        System.out.println(Arrays.toString(shuffleTheArr(nums, 3)));

    }

    public static int[] shuffleTheArr(int[] nums, int n){
        int[] result = new int[nums.length];
        int count = 0;

        for (int i = 0; i < n; i++) {
            result[count++] = nums[i];
            result[count++] = nums[i+n];
        }

        return result;
    }
}
