package org.dsa.linkedlist;



public class DeleteNodeInLL {
    void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Cannot delete if it's the last node or null
        }

        ListNode nextNode = node.next;
        node.data = nextNode.data;  // Copy data from next node
        node.next = nextNode.next;  // Skip the next node
        nextNode.next = null;       // Help garbage collection
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original List: ");
        printList(head);

        // Deleting node with value 5 (assuming we have direct access to it)
        DeleteNodeInLL solution = new DeleteNodeInLL();
        solution.deleteNode(head.next); // Deleting node with value 5

        System.out.print("List after deleting node 5: ");
        printList(head);
    }
}
