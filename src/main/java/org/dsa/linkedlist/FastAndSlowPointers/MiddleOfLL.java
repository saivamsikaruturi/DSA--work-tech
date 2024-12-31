package org.dsa.linkedlist.FastAndSlowPointers;

import org.dsa.linkedlist.ListNode;

public class MiddleOfLL {

      static ListNode getMiddleOfLinkedList(ListNode head){

          ListNode fast = head;
          ListNode slow = head;

          while(fast!=null && fast.next!=null){
              fast=fast.next.next;
              slow = slow.next;
          }

          return slow;
      }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode middle = getMiddleOfLinkedList(head);
        printList(middle);
    }


    private static void printList(ListNode result) {
        while(result!=null){
            System.out.println(result.data);
            result = result.next;
        }
    }
}
