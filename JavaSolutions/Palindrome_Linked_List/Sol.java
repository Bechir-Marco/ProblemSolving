package Palindrome_Linked_List;

import java.util.List;

public class Sol {
    public boolean isPalindrome(ListNode head) {
        ListNode slowP = head;
        ListNode fastP = head;

        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }

        ListNode secondHalf = reverseList(slowP);
        ListNode firstHalf = head;


        while (secondHalf != null) {
            if (secondHalf.val != firstHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    ListNode reverseList(ListNode middleHead) {
        ListNode prev = null;
        ListNode current = middleHead;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode previous;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
