package com.algoquestionsAll.arraysAndStrings.basicArraysAndStrings;
/*
Day 1: Find Pivot Index
Problem Description:
Given an array of integers nums, write a method that returns the "pivot" index of this array. The pivot index is the
index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right
of the index.
If no such index exists, return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */

public class FindPivotIndex {
    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        System.out.println(findPivotIndex(nums));

    }

    public static int findPivotIndex(int[] arr){
        int totalSum = 0;

        for (int num : arr) {
            totalSum+=num;
        }

        int runningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(runningSum==totalSum-runningSum-arr[i]){
                return i;
            }
            runningSum+=arr[i];
        }
        return -1;
    }

}
