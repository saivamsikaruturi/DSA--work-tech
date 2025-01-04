package org.dsa.linkedlist;

public class RotateList {

     static  ListNode rotateList(ListNode node,int k) {

         int length = getLength(node);
         if (node == null || node.next == null || k == 0) {
             return node;
         }

         k = k % length;
         if (k == 0) {
             return node; // No rotation needed if k is a multiple of the length
         }
             int currentRotation = 1;
             ListNode temp = node;

             while (currentRotation < length - k) {
                 temp = temp.next;
                 currentRotation++;
             }

             ListNode tailNode = temp;
             ListNode first = temp.next;

             while (temp.next != null) {
                 temp = temp.next;
             }

             ListNode last = temp;
             last.next = node;
             tailNode.next = null;
             node = first;

             return node;



     }

    private static int  getLength(ListNode node) {
         ListNode temp = node;
         int count = 0;
         while(temp!=null){
             count++;
             temp=temp.next;
         }
         return count;
    }

    public static void printList(ListNode result) {
        while(result!=null){
            System.out.println(result.data);
            result = result.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Linked list before rotating: ");
        printList(head);
        ListNode node = rotateList(head,2);
        System.out.print("Linked list in after rotating: ");
        printList(node);

    }
}
