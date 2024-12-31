package org.dsa.linkedlist;

public class DetectLoop {
   static ListNode getStartingNodeOfLoop(ListNode list) {
        ListNode slow = list;
        ListNode fast = list;

        // Detect loop and find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If there's no loop, return null
        if (fast == null || fast.next == null) {
            return null;
        }

        // Move slow to the head. Keep fast at the meeting point.
        slow = list;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Return the starting node of the loop
        return slow;
    }

    public static void createCycle(ListNode head, int pos) {
        if (pos == -1) {
            return;
        }

        ListNode tail = head;
        ListNode cycleNode = null;
        int index = 0;

        // Traverse to the end of the list and the node at position `pos`
        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail; // Remember the node at position `pos`
            }
            tail = tail.next;
            index++;
        }

        // Create a cycle
        tail.next = cycleNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        int pos = 1;
      createCycle(head, pos);

        // Check for cycle
        ListNode result = getStartingNodeOfLoop(head);

        // Output
        System.out.println("Cycle detected: " + result.data); // Output: true
    }
}
