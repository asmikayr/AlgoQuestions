package com.algoquestionsAll.veryBasic;
/*
Write a function to find the smallest number in an array.
 */
public class FindTheSmallestNumberInAnArray {

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 2, 8, 1};

        System.out.println(findMinNumber(nums));
    }

    public static int findMinNumber(int[] nums){
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(min > nums[i]){
                min = nums[i];
            }

        }
        return min;
    }

}
