package com.example;

import java.util.Stack;

public class LinkedListPalindrome {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<Integer> myStack = new Stack<>();
        ListNode current = head;

        while (current != null) {
            myStack.push(current.val);
            current = current.next;
        }

        current = head;

        while (current != null && current.val == myStack.pop()) {
            current = current.next;
        }

        return current == null;

    }
}

