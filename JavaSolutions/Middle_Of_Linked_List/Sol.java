package Middle_Of_Linked_List;

public class Sol {
    public ListNode middleNode(ListNode head) {
        int counter =0;
        int middlecounter =0;
        ListNode prev = head;
        while (head !=null){
            head = head.next;
            counter++;
        }
        while (middlecounter<counter/2){
            prev= prev.next;
            middlecounter++;
        }
        return prev;
    }
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


