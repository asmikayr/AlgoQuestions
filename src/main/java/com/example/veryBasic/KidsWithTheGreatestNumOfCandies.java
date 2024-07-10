package com.example.veryBasic;
/*
Day 7: Kids With the Greatest Number of Candies
Problem Description:
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the i-th
kid has. For each kid, check if there is a way to distribute the extra candies such that they will have the greatest
number of candies among all the kids. Notice that multiple kids can have the greatest number of candies.
 */

import java.util.Arrays;

public class KidsWithTheGreatestNumOfCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};

        System.out.println(Arrays.toString(findKidsWithGreatestNOfCandies(candies, 3)));


    }

    public static boolean[] findKidsWithGreatestNOfCandies(int[] candies, int extraCandies){
        boolean[] isGreatestNums = new boolean[candies.length];
        int max = candies[0];
        for (int candy : candies) {
            if(candy>max) max = candy;

        }

        int count = 0;

        for (int candy : candies) {
            isGreatestNums[count++] = candy + extraCandies >= max;
        }
        return isGreatestNums;

    }
}
