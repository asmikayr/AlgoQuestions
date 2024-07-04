package com.example;

/*
Write a Java program to find the maximum element in an array.
 */

public class MaxElementInArray {

    public static void main(String[] args) {
        int[] nums = {7, 19, 36, 900, 120, 3, 14};

        System.out.println(findMaxElement(nums));

    }

    public static int findMaxElement(int[] nums){
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]>max){
                max = nums[i];
            }

        }

        return max;
    }
}
