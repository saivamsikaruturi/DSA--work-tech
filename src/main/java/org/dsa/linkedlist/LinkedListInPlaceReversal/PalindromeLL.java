package org.dsa.linkedlist.LinkedListInPlaceReversal;

import org.dsa.linkedlist.ListNode;

public class PalindromeLL {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null){
            slow = slow.next;
        }

        slow = reverseList(slow);

        fast = head;

        while(slow!=null){
            if(fast.data==slow.data){
                fast=fast.next;
                slow = slow.next;
            }
            else{
                return false;
            }
        }
        return true;

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while(currentNode!=null){
            ListNode nextNode=currentNode.next;
            currentNode.next= prevNode;
            prevNode = currentNode;
            currentNode= nextNode;

        }
        head = prevNode;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        boolean result = isPalindrome(head);
        System.out.println(result);
    }
}
