package com.example.linkedLists;
/*
Find the Middle of a Linked List
Problem:
Given the head of a singly linked list, return the middle node of the linked list.
 */

import com.example.linkedLists.ListNode;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
