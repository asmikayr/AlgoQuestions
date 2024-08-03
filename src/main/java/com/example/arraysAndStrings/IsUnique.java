package com.example.arraysAndStrings;
/*
IsUnique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
Hint1: Try a hash table.
Hint2: Could a bit vector be useful?
Hint3: Can you solve it in O(N log N) time? What might a solution like that look like?
 */

public class IsUnique {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "abcde ";
        System.out.println(isUniqueChars(str));
        System.out.println(isUniqueChars(str2));

    }

    /*
    Solution with a boolean array.
    The time complexity for this code isO( n ), where n is the length of the string.
    The space complexity isO(1).
(You could also argue the time complexity is 0(1),
since the for loop will never iterate through more than
128 characters.) If you didn't want to assume the character
set is fixed, you could express the complexity as
O( c) space and O(min ( c, n)) or O( c) time,
where c is the size of the character set.
     */

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i= 0; i < str.length(); i++) {
        int val= str.charAt(i);
        if (char_set[val]) {//Already found this char in string
            return false;
        }
        char_set[val] = true;
    }
        return true;
    }


}
