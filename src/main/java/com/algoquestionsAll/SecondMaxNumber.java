package com.algoquestionsAll;

/**
 * Write a Java program to find the second largest number in an array.
 */

public class SecondMaxNumber {

    public static void main(String[] args) {
        int[] nums = {1,9,8,6,5,9,19};

        System.out.println(find2ndLargestNum(nums));

    }

    public static int find2ndLargestNum(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num: nums) {
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
                second = num;
            }
        }

        return second;
    }
}
