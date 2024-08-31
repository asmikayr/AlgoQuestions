package com.algoquestionsAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LinkedListPalindromeTest {

    @Test
    void isPalindrome() {
    }

    @ParameterizedTest
    @MethodSource("generateTestData")
    void isPalindrome(int[] expected, int[] input) {
        //create linked list
        for (int number : input) {
        //    LinkedListPalindrome.add(number);
        }
        //invoke your method that should be tested.
      //  LinkedListPalindrome.isPalindrome(linkedListWeek25.head);
        //apply your checker method and create your assertion based on method logic
      //  assertTrue(linkedListChecker(linkedListWeek25.head, expected));
    }

    public static Stream<Arguments> generateTestData() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4}, new int[]{1, 2, 2, 3, 3, 4}),
                Arguments.arguments(new int[]{1, 2}, new int[]{1, 2, 2}),
                Arguments.arguments(new int[]{1}, new int[]{1})
        );
    }

//    public boolean linkedListChecker(NodeWeek25 head, int[] expected) {
//        NodeWeek25 current = head;
//        int n = 0;
//        while (current != null && n < expected.length) {
//            if (current.value != expected[n]) {
//                return false;
//            }
//            current = current.next;
//            n++;
//        }
//
//        return true;
//    }


}