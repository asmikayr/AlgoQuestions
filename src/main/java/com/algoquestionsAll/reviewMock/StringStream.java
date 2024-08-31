package com.algoquestionsAll.reviewMock;
/*
Q8: Write a Java program that uses a stream to process a list of strings. The program should:
Filter out strings that are less than 4 characters long.
Convert each remaining string to uppercase.
Collect the results into a new list and print them.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("abc");

        words.add("How are you today");
        words.add("Java is the best");
        words.add("de");

        System.out.println(words);


       words = words.stream()
                .filter(w-> w.length()<=4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(words);

    }

}
