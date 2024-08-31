package com.algoquestionsAll.sortingAndSearching;

/*
Problem:
Given a sorted array of integers nums and an integer target,
return the index of target if it is present. Otherwise, return -1.
 */

public class BinarySearch {
    public static int search(int[] nums, int target) {
        // Calculate the middle index
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Test case 1: nums = [-1, 0, 3, 5, 9, 12], target = 9
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println("Index of target: " + search(nums, target)); // Output: 4

        // Test case 2: nums = [-1, 0, 3, 5, 9, 12], target = 2
        target = 2;
        System.out.println("Index of target: " + search(nums, target)); // Output: -1
    }
}


