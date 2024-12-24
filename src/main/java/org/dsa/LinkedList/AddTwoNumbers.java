package org.dsa.LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);



        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result); // Output: [7,0,8]

    }

    private static void printList(ListNode result) {
        while(result!=null){
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0;
        while(l1 != null || l2 != null){

            int sum = carry;
            if(l1 != null){
                sum+=l1.data;
                l1=l1.next;
            }

            if(l2 != null){
                sum +=l2.data;
                l2=l2.next;
            }

            carry = sum/10;
            sum = sum%10;

            ptr.next = new ListNode(sum);
            ptr = ptr.next;

        }

        if(carry == 1) ptr.next = new ListNode(1);

        return result.next;
    }

}
