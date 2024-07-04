package com.example;

public class FindMinimumSumConsecutiveElementsInArray {

    public static void main(String[] args) {
        int[] nums = {5,7,1,4,3,6,2,9,2};

        System.out.println(findMinSum(nums, 4));


    }




    public static int findMinSum(int[] nums, int k){
        int n = nums.length;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int minSum = currentSum;

        for (int i = k; i < n ; i++) {

            currentSum += nums[i] - nums[i-k];

            minSum = Math.min(minSum, currentSum);

        }

        return minSum;
    }
}
