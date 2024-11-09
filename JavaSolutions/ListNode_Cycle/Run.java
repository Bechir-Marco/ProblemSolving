package ListNode_Cycle;

public class Run {
    public static void main(String[] args) {
    Sol sol = new Sol();

        ListNode nodeA= new ListNode(1);
        ListNode nodeB= new ListNode(4);
        ListNode nodeC= new ListNode(3);
        ListNode nodeD= new ListNode(5);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeA;

        System.out.println("cycle est trouvé "+sol.hasCycle(nodeC));

    }
}
