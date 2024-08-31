package com.algoquestionsAll.veryBasic;

/*
Day 5: Reverse an Array
Problem Description:
Write a function to reverse an array.
 */

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(reverseAnArrayWithNewArray(nums)));
        System.out.println(Arrays.toString(reverseAnArrayInPlace(nums)));

    }

    public static int[] reverseAnArrayWithNewArray(int[] nums){
        int[] rev = new int[nums.length];
        int count = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            rev[count++] = nums[i];
        }

        return rev;
    }

    public static int[] reverseAnArrayInPlace(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return nums;
    }

}
