package Remove_Linked_List_Elements;

public class Sol {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode currentp = head;
        ListNode prevP = dummy;

        while (currentp != null) {
            if (currentp.val == val) {

                prevP.next = currentp.next;
            } else {
                prevP = currentp;
            }
            currentp = currentp.next;
        }

        return dummy.next;
    }
}
 class ListNode {
      int val;
      ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
