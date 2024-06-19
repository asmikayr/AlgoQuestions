package com.example.deleteNNodesAfterMNodes;

public class DeleteNNodeAfterMNodes {


        public static void main(String[] args) {
            MySinglyLinkedList mylist1=new MySinglyLinkedList();

            mylist1.add(1);mylist1.add(2);mylist1.add(3);  mylist1.add(4);
            mylist1.add(5);mylist1.add(6);mylist1.add(7);mylist1.add(8);
            mylist1.add(9);mylist1.add(10);
            ListNode current = mylist1.head;
            while (current!=null){
                System.out.println(current.val);
                current=current.next;
            }

            ListNode newHead = deleteNNodeAfterMNodes(mylist1.head, 1, 3);

            while (newHead!=null){
                System.out.println(newHead.val);
                newHead=newHead.next;
            }



        }





    public static ListNode deleteNNodeAfterMNodes(ListNode head, int m, int n){

        ListNode current = head;
        ListNode pointer = head;

        while(current!= null){

            for (int i = 1; i < m && pointer.next != null; i++) {
                pointer = pointer.next;
            }

            current = pointer.next;

            for (int i = 1; i <= n && current != null; i++) {
                current = current.next;
            }

            pointer.next = current;
            pointer = current;
        }

        return head;


    }

}
