package com.algoquestionsAll.linkedLists.deleteNNodesAfterMNodes;

public class MySinglyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

  void addFirst(int data){
      // create a new node object from data
      ListNode node=new ListNode(data);
     // case 1: list empty
      if(isEmpty()){
       head=tail=node;
      } else{// case 2 : list is not empty
          node.next=head;
          head=node;
      }
      //increase size
      size++;
  }
  public int getKthItemFromLast(int k){
        // create two pointers
        ListNode ptr1=head;
        ListNode ptr2=head;
        // move ptr2 k-1 times

      for (int i = 0; i < k-1; i++) {
          ptr2=ptr2.next;
      }
      // move both pointers until ptr2 hits the last element
      while(ptr2.next!=null){
          ptr1=ptr1.next;
          ptr2=ptr2.next;
      }
      // ptr1 is on the kth element from the last
      return ptr1.val;
  }
    public void removeKthItemFromLast(int k){
        // create three pointers
        ListNode ptr1=head;
        ListNode ptr2=head;
        ListNode prev=null;
        // move ptr2 k-1 times

        for (int i = 0; i < k-1; i++) {
            ptr2=ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while(ptr2.next!=null){
            prev=ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        // ptr1 is on the kth element from the last
       // Do delete operation
        if (ptr1==head){
            head=ptr1.next;
            ptr1.next=null;
            size--;
        }else if(ptr1==tail){
            tail=prev;
            prev.next=null;
            size--;
        } else {
            prev.next=ptr1.next;
            ptr1.next=null;
            size--;

        }
    }
    void add(int data) {
        // create a new node object from data
        ListNode node = new ListNode(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }

    }
    void deleteById(int id){
        // check if empty
        if(isEmpty()) System.out.println("List is empty!!!");
        // assign prev and current with the head

        ListNode prev=head;
        ListNode current=head;
        while(current!=null){
            if(current.val==id){// there is a match
                //case 1: head
                if(current==head){
                    head=current.next;
                    current.next=null;
                }
                // case 2 : tail
                else if(current==tail){
                    tail=prev;
                    prev.next=null;//Ex -Tail will be eligible for Garbage Collection
                }
                // case 3 : middle
                else{
                    prev.next=current.next;
                    current.next=null;// Current will be eligible for Garbage Collection
                }
                // after deletion
                size--;
            }
            // move forward on the elements of the list
            prev=current;
            current=current.next;

        }

    }
    int indexOf(int id){
        if (isEmpty()) return -1;
        int pos=0;
        // iterate through the list
        ListNode current=head;// set my current with the starting element;
        while(current!=null){
            if(current.val==id) return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }
    void printNodes(){
        ListNode current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.val+"=> null");
            else {
            System.out.print(current.val+"=> ");
            }
            current=current.next;
        }
  }


    public void removeKthFromLast2(int k){
        ListNode ptr1=head;
        ListNode ptr2=head;
        for(int i=0;i<k-1;i++) {

            ptr2=ptr2.next;

            if (ptr2==null)  System.out.println("Less than k elements");

            else if(ptr2.next==null){
                head=ptr1.next;
                ptr1.next=null;
                return;
            }
        }
        while(ptr2.next.next!=null) {

            ptr1=ptr1.next;
            ptr2=ptr2.next;

        }

        ptr1.next=ptr1.next.next;
        ptr1=ptr1.next;
        ptr1=null;


    }


}