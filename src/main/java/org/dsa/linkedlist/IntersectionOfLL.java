package org.dsa.linkedlist;

public class IntersectionOfLL {
        public static void main(String[] args) {
            // Input values
            int intersectVal = 8;
            int[] listA = {4, 1, 8, 4, 5};
            int[] listB = {5, 6, 1, 8, 4, 5};
            int skipA = 2;
            int skipB = 3;

            // Create linked lists
            ListNode headA = createLinkedList(listA);
            ListNode headB = createLinkedList(listB);

            // Create intersection
            ListNode intersectNode = getNodeAt(headA, skipA);
            ListNode tempB = getNodeAt(headB, skipB - 1);
            tempB.next = intersectNode; // Connect listB to intersectNode
            
            
            // call get intersection
            ListNode intersectionPoint = getIntersection(headA,headB);
            System.out.println(intersectionPoint.data);
    }

    private static ListNode getIntersection(ListNode headA, ListNode headB) {

            /*
             steps:
             1. calculate the length of both lists.
             2. move the pointer of longest list to len of longest list - smallest list
             3. then compare the values of both the lists.
             4. if found equal return the node.
             */

         int lenA = calculateLength(headA);
         int lenB = calculateLength(headB);

         ListNode tempA = headA;
         ListNode tempB = headB;

         while(lenA > lenB){
             lenA--;
            tempA = tempA.next;

         }

        while(lenB > lenA){
            lenB--;
            tempB = tempB.next;

        }
               while (tempA!=tempB) {
               tempA = tempA.next;
               tempB = tempB.next;
         }

            return  tempB;
    }

    private static int calculateLength(ListNode headA) {
            ListNode temp = headA;
            int len = 1;
            while (temp!=null){
                len++;
                temp = temp.next;
            }
            return len;
    }

    private static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to get the node at a specific position (0-based index)
    private static ListNode getNodeAt(ListNode head, int index) {
        ListNode current = head;
        while (index > 0 && current != null) {
            current = current.next;
            index--;
        }
        return current;
    }

}
