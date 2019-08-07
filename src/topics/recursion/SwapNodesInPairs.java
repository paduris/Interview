package topics.recursion;


/**
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class SwapNodesInPairs {

    public static void main(String[] args) {


        SwapNodesInPairs pairs = new SwapNodesInPairs();


        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        pairs.swapPairs(node1);


    }


    public ListNode swapPairs(ListNode head) {

       if(head == null || head.next == null )
       {
           return head;
       }
        head.next.next = swapPairs(head.next.next);

        ListNode temp = head.next.next;
        ListNode newHead = head.next;
        head.next.next = head;
        head.next = temp;

        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}