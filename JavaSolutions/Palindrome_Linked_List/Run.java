package Palindrome_Linked_List;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        ListNode nodeA= new ListNode(1);
        ListNode nodeB= new ListNode(2);
        ListNode nodeC= new ListNode(3);
        ListNode nodeD= new ListNode(3);
        ListNode nodeE= new ListNode(2);
        ListNode nodeF= new ListNode(0);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;

        System.out.println("List Palindrome "+sol.isPalindrome(nodeA));

    }

}
