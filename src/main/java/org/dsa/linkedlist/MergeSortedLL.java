package org.dsa.linkedlist;


public class MergeSortedLL {

    ListNode mergeTwoSortedList(ListNode firstList, ListNode secondList) {
        // Dummy node to simplify merging
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Merge while both lists have elements
        while (firstList != null && secondList != null) {
            if (firstList.data <= secondList.data) {
                tail.next = firstList;
                firstList = firstList.next;
            } else {
                tail.next = secondList;
                secondList = secondList.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes
        tail.next = (firstList != null) ? firstList : secondList;

        return dummy.next; // Skip dummy node and return merged list head
    }

    // Utility function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: 1 -> 3 -> 5
        ListNode firstList = new ListNode(1);
        firstList.next = new ListNode(3);
        firstList.next.next = new ListNode(5);

        // Example: 2 -> 4 -> 6
        ListNode secondList = new ListNode(2);
        secondList.next = new ListNode(4);
        secondList.next.next = new ListNode(6);

        MergeSortedLL merger = new MergeSortedLL();
        ListNode mergedList = merger.mergeTwoSortedList(firstList, secondList);

        System.out.print("Merged Sorted List: ");
        printList(mergedList);
    }
}
