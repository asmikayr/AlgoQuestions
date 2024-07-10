package com.example.veryBasic;
/*
Day 3: Concatenation of Array
Problem Description:
Given an integer array nums of length n, create an array of length 2n where the first n elements are exactly the same
as nums, and the next n elements are also exactly the same as nums. Return the concatenated array.
 */

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};

        System.out.println(Arrays.toString(getConcatenatedArray(nums)));

    }

    public static int[] getConcatenatedArray(int[] nums){
        int[] newArr = new int[nums.length*2];

        int count=0;

        for (int j : nums) {
            newArr[count++] = j;
        }

        for (int num : nums) {
            newArr[count++] = num;
        }


        return newArr;
    }
}
