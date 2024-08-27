package com.example;
/*
Find the Second Largest Element in an Array:
Given an array of integers, write a Java program to find
the second largest element.
 */

import java.util.Arrays;
import java.util.OptionalInt;

public class FindTheSecondLargestNumInArr {


    public int findSecondLargestNum(int[] nums){

        // Ensure the array has at least two distinct elements
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        // Use streams to find the second largest number
        OptionalInt secondLargest = Arrays.stream(nums)
                .distinct() // Remove duplicates
                .sorted()   // Sort in ascending order
                .skip(nums.length - 2) // Skip all but the last two elements
                .findFirst(); // Take the remaining element, which is the second largest

        // Check if a second largest element was found
        if (secondLargest.isPresent()) {
            return secondLargest.getAsInt();
        } else {
            throw new IllegalArgumentException("No second largest element found");
        }
    }

    public int findSecondLargestNum2(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }
}
