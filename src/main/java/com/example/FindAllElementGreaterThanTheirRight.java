package com.example;

import java.util.List;
import java.util.Stack;

public class FindAllElementGreaterThanTheirRight {

    public static void main(String[] args) {
        System.out.println(find(new int[]{10,4,6,3,5}));
    }



    public static List<Integer> find(int[]arr){
        Stack<Integer> result = new Stack<>();

        int i = 0;
        int step = 1;

        while( i >= 0 && i < arr.length) {
           while(!result.isEmpty()&&arr[i]>=result.peek()){
               result.pop();
           }
           result.push(arr[i]);
           i+=step;
        }

        return result;
    }
}
/*
Given an unsorted integer array, return all greater elements than all elements present to their right using
Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5.
10 > 4 & 10 > 6 & 10 > 3 & 10 > 5
 */