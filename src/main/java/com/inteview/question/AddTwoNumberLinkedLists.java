package com.inteview.question;

public class AddTwoNumberLinkedLists {

    public static void main(String[] a) {

        ListNode node11 = new ListNode(3);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(5);

        node11.next= node12;
        node12.next=node13;


        ListNode node21 = new ListNode(3);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(1);

        node21.next= node22;
        node22.next=node23;



        ListNode resultNode = addTwoNumbers(node11,node21);

        System.out.println(resultNode.val+" " +resultNode.next.val + " "+ resultNode.next.next.val);

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}
