package com.example.arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacterInString {
    public static int firstUniqChar(String s) {

        if (s == null || s.isEmpty()) {
            return -1;
        }

        // Step 1: Count character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Identify the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character found
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Index of first unique character: " + firstUniqChar("leetcode")); // Output: 0
        System.out.println("Index of first unique character: " + firstUniqChar("loveleetcode")); // Output: 2
        System.out.println("Index of first unique character: " + firstUniqChar("aabb")); // Output: -1
    }
}
