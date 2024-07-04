package com.example;
/*
Question-2 Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
 0 <= s.length <= 5 * 104
 s consists of English letters, digits, symbols, and spaces.

Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {

    /*
    BRUTE-FORCE Solution
    You would need to generate all possible substrings of the given string and
    then check each one to determine if it has all unique characters.
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;

        for (int i = 0; i < n; i++) { //Generate all substrings: Iterate through the string to generate all possible substrings.
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {//Check for unique characters: For each substring, check if all characters in it are unique.
                    longest = Math.max(longest, j - i);//Keep a record of the longest substring found that meets the criteria.
                }
            }
        }
        return longest;
    }

    private boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    /*
    Sliding window solution
     */
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>(); //Use a set or a map to keep track of characters and their positions within the current window.
        int maxLength = 0, start = 0, end = 0; //Use two pointers, typically start and end, to represent the current window.

        while (end < n) {//Move the end pointer to include more characters in the current window.
            // Expand the window by including the character at 'end'
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);//Keep track of the maximum length of all valid windows encountered during the process.
            } else {
                // Shrink the window from the start to remove the duplicate character
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
