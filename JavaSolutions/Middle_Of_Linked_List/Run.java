package Middle_Of_Linked_List;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
    ListNode nodeA= new ListNode(1);
    ListNode nodeB= new ListNode(2);
    ListNode nodeC= new ListNode(3);
    ListNode nodeD= new ListNode(4);
    ListNode nodeE= new ListNode(5);
    nodeA.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;
    nodeD.next = nodeE;
        ListNode  res = new ListNode();
        res = sol.middleNode(nodeA);

    while (nodeA !=null) {
        System.out.print(nodeA.val+ " -> ");
        nodeA = nodeA.next;

    }
        System.out.println("le node en milieu c'est "+res.val);
    }
}
