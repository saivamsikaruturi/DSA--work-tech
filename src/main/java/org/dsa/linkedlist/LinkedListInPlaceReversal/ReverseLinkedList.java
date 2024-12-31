package org.dsa.linkedlist.LinkedListInPlaceReversal;

import org.dsa.linkedlist.ListNode;

public class ReverseLinkedList {
    static ListNode reverse (ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        while(current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;

    }

    public static void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         head.next.next.next.next = new ListNode(5);
         ListNode result = reverse(head);
         printList(result);


    }

    private static void printList(ListNode result) {
        while(result!=null){
            System.out.println(result.data);
            result = result.next;
        }
    }
}
