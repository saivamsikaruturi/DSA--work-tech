package org.dsa.linkedlist;

public class AddOneToLL {

    ListNode addOneToList(ListNode head) {
        ListNode temp = reverse(head);
        ListNode prev = null;
        ListNode current = temp;
        int carry = 1;  // Start with carry as 1 since we are adding one

        while (current != null) {
            int sum = current.data + carry;
            carry = sum / 10;
            current.data = sum % 10;
            prev = current;
            current = current.next;
        }

        // If there's a carry left after the loop, add a new node
        if (carry == 1) {
            prev.next = new ListNode(1);
        }

        return reverse(temp);
    }

    public static ListNode reverse(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 9 -> 9 -> 9
        ListNode head = new ListNode(1);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(9);

        System.out.print("Original List: ");
        printList(head);

        AddOneToLL solution = new AddOneToLL();
        head = solution.addOneToList(head);

        System.out.print("List after adding 1: ");
        printList(head);
    }
}
