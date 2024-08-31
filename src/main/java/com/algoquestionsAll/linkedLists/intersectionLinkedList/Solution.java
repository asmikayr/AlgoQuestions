package com.algoquestionsAll.linkedLists.intersectionLinkedList;

public class Solution {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        ListNode node8 = new ListNode(1);

        node6.next = node7;
        node7.next = node8;
        node8.next = node3;

        System.out.println(getIntersectionNode(node1, node6).val);

    }






    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        while(pointer1 != pointer2){
            if(pointer1 == null){
                pointer1 = headB;
            }else{
                pointer1 = pointer1.next;
            }

            if(pointer2 == null){
                pointer2 = headA;
            }else{
                pointer2 = pointer2.next;
            }
        }

        return pointer1;
    }
}
