package Intersection_Two_Linked_List;

public class Run {
    public static void main(String[] args) {

            Sol solution = new Sol();

            // Création des nœuds pour la liste A
            ListNode common = new ListNode(8);
            common.next = new ListNode(4);
            common.next.next = new ListNode(5);

            ListNode headA = new ListNode(4);
            headA.next = new ListNode(1);
            headA.next.next = common;

            // Création des nœuds pour la liste B
            ListNode headB = new ListNode(5);
            headB.next = new ListNode(6);
            headB.next.next = new ListNode(1);
            headB.next.next.next = common;

            // Appel de la méthode pour trouver le nœud d'intersection
            ListNode intersection = solution.getIntersectionNode(headA, headB);

            // Affiche le résultat
            if (intersection != null) {
                System.out.println("Intersected at '" + intersection.val + "'");
            } else {
                System.out.println("No intersection");
            }
        }
    }
