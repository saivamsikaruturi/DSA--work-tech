package org.dsa.linkedlist;

public class SwapNodesInPairs {

     static ListNode getSwappedList(ListNode head){
         ListNode dummy = new ListNode(-1);
         dummy.next = head;

         ListNode point = dummy;

         while (point.next!=null && point.next.next!=null){

             ListNode swap1 = point.next;
             ListNode swap2 = point.next.next;

             swap1.next = swap2.next;
             swap2.next = swap1;

             point.next = swap2;
             point = swap1;
         }
         return  dummy.next;
     }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode res = getSwappedList(head);
        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(res);
    }
}
