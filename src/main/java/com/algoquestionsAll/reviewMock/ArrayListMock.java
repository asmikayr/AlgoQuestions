package com.algoquestionsAll.reviewMock;

/*
Q4: Write a Java program that demonstrates the use of an ArrayList to store a list of integers.
Add ten integers to the list, remove the integer at index 5,
and then print out the remaining integers in the list.
 */

import java.util.ArrayList;

public class ArrayListMock {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }

        ints.remove(5);

        System.out.println(ints);
    }



}
