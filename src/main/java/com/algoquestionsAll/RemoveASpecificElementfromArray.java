package com.algoquestionsAll;

/*
Write a Java program to remove a specific element from an int array.
 */

import java.util.Arrays;

public class RemoveASpecificElementfromArray {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        removeElement(nums, 2);
    }

    public static void removeElement(int[] nums, int k){

        for (int i = k; i < nums.length-1; i++) {

            nums[i] = nums[i+1];


        }

        System.out.println(Arrays.toString(nums));


    }

}
