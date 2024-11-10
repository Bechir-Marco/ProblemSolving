package Remove_Linked_List_Elements;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        ListNode nodeA = new ListNode();
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(6);
        ListNode nodeD = new ListNode(3);
        ListNode nodeE = new ListNode(4);
        ListNode nodeF = new ListNode(5);
        ListNode nodeG = new ListNode(6);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeG.next = nodeG;

        ListNode newHead = sol.removeElements(nodeA, 6);
       while (nodeA!=null) {

        System.out.print( +nodeA.val+ " -> ");
        nodeA = nodeA.next;

       }
        System.out.println("null :(");

    }
}
