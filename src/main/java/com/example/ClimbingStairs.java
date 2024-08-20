package com.example;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps.
In how many distinct ways can you climb to the top?
 */

public class ClimbingStairs {
        public int climbStairs(int n) {
            if (n == 1) return 1;

            int first = 1, second = 2;
            for (int i = 3; i <= n; i++) {
                int third = first + second;
                first = second;
                second = third;
            }

            return second;
        }

}
