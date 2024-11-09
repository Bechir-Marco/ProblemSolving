package ListNode_Cycle;

public class Sol {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next ==null) return false;

        ListNode slowP = head;
        ListNode fastP = head;

        while (fastP!= null || fastP.next!=null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if (fastP== slowP) return true;

        }
        return false;
    }

    class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
}
