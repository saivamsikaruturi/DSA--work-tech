package org.dsa.recursion;

import org.dsa.linkedlist.ListNode;

public class Merge2SortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases: if either list is null, return the other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Recursive case: compare the current nodes
        if (list1.data <= list2.data) {
            list1.next = mergeTwoLists(list1.next, list2); // Merge the rest of list1 and list2
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next); // Merge list1 and the rest of list2
            return list2;
        }
    }

    private static void printList(ListNode result) {
        while(result!=null){
            System.out.println(result.data);
            result = result.next;
        }
    }

    public static void main(String[] args) {


        // Create the first sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Create the second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Print the input lists
        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
       printList(list2);

        // Merge the two lists
        ListNode mergeTwoLists = mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged List:");
       printList(mergeTwoLists);

}
}
