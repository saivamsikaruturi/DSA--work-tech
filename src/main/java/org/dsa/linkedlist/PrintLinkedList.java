package org.dsa.linkedlist;

public class PrintLinkedList {
   public void print (ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
}
