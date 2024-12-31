package org.dsa.linkedlist;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = removeNthNode(head,2);
        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(res);

    }

      static ListNode removeNthNode(ListNode head,int n){

          ListNode dummy = new ListNode(-1);
          dummy.next = head;

          ListNode first = dummy;
          ListNode second = dummy;

          for(int i = 0;i<n;i++){
              second = second.next;
          }

          while (second.next!=null){
              second = second.next;
              first = first.next;
          }

           first.next = first.next.next;

          return dummy.next;
      }

}
