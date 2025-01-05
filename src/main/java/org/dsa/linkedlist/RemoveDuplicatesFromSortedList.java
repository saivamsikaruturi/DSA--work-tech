package org.dsa.linkedlist;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = head;
        ListNode prev = dummy;

        while(current != null){

            // if the element is duplicated
            if(current.next != null && current.data == current.next.data){

                //iterate until the elements are same.
                while(current.next != null && current.data == current.next.data){
                    current = current.next;
                }

                // skip the duplicates by moving the prev's next to current's next. in this example for first time  2's next point to 4.
                prev.next = current.next;
            }

            // need to move the prev pointer if the number is not duplicated. in this example, 1 !=2 , so move prev i.e from dummy to 1.
            else{
                prev = prev.next;
            }

            // need to move the current pointer every time.
            current = current.next;

        }


        return dummy.next;

    }

    public static void printList(ListNode result) {
        while(result!=null){
            System.out.println(result.data);
            result = result.next;
        }
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(5);
        System.out.println("Linked list before removing duplicates: ");
        printList(node);
        ListNode newNode = deleteDuplicates(node);
        System.out.println("after removing duplicates");
        printList(newNode);
    }
}
