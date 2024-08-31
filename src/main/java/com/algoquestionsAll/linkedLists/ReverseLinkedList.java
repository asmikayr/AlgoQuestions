package com.algoquestionsAll.linkedLists;
/*
Problem:
Given the head of a singly linked list, reverse the list and return the reversed list.
 */


public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        // Handle the edge case of an empty list
        if (head == null) {
            return null;
        }
        //Initialize prev and curr; prev is null, will turn curr pointer to prev
        ListNode prev = null;//this will become the new end of the list
        //Starting from the first node/head
        ListNode curr = head;
        //Iterating throw Linked List,going from the beginning till the end
        while (curr != null) {
            // Save the next node to not lose the rest of the list while turning the pointer of the node
            ListNode nextTemp = curr.next;
            //turning the pointer to prev
            curr.next = prev;
            //moving prev to curr
            prev = curr;
            //moving curr to the next node
            curr = nextTemp;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversedHead);
    }
}
