package com.algoquestionsAll;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,3,5,11};

        System.out.println(Arrays.toString(twoSumBruteForceSolution(nums, 8)));
        System.out.println(Arrays.toString(twoSumWithMap(nums, 8)));
    }

    public static int[] twoSumBruteForceSolution(int[] nums, int target) {

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }

        return arr;
    }

    public static int[] twoSumWithMap(int[] nums, int target) {
        Map<Integer, Integer> compliments = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if(compliments.containsKey(target-nums[i])){//in map key we store value, in value we store index(indice)
                arr[0] = compliments.get(target - nums[i]);
                arr[1] = i;
            }else{
                compliments.put(nums[i], i);
            }
        }
        return arr;
    }
}
