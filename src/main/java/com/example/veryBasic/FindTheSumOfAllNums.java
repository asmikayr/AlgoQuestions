package com.example.veryBasic;

public class FindTheSumOfAllNums {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,7};

        System.out.println(findSumOfNums(nums));


    }

    public static int findSumOfNums(int[] nums){
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

}
