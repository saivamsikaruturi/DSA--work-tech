package org.dsa.linkedlist;

public class PrintLLinReverseOrder {
    void printInReverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // At this point, 'prev' is the new head of the reversed linked list
        while (prev != null) {
            System.out.print(prev.data + " ");
            prev = prev.next;
        }

    }
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the linked list in reverse order
        PrintLLinReverseOrder solution = new PrintLLinReverseOrder();
        System.out.print("Linked list in reverse order: ");
        solution.printInReverse(head);
    }
}
