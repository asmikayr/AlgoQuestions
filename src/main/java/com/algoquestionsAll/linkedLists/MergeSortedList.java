package com.algoquestionsAll.linkedLists;

/*
Merge two sorted linked lists and return it as a new sorted list.
 */

public class MergeSortedList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(0); // Dummy node to start the merged list
        ListNode current = temp;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // At this point, at least one of the lists is null
        if(list1 != null) {
            current.next = list1; // Attach the remaining list1 if list2 is exhausted
        } else {
            current.next = list2; // Attach the remaining list2 if list1 is exhausted
        }

        return temp.next; // Return the merged list, skipping the dummy node
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test case 1: list1 = [1, 2, 4], list2 = [1, 3, 4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList); // Output: [1, 1, 2, 3, 4, 4]

        // Test case 2: list1 = [], list2 = []
        list1 = null;
        list2 = null;
        mergedList = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList); // Output: []

        // Test case 3: list1 = [], list2 = [0]
        list1 = null;
        list2 = new ListNode(0);
        mergedList = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList); // Output: [0]
    }


}
