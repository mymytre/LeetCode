package Algorithms;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution021 {

    public static void main(String[] args) {
        Solution021 solution021 = new Solution021();

        ListNode z = new ListNode(3);
        ListNode y = new ListNode(2, z);
        ListNode x = new ListNode(1, y);

        ListNode c = new ListNode(4);
        ListNode b = new ListNode(3, c);
        ListNode a = new ListNode(1, b);

        solution021.mergeTwoLists(a, x);


    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode outNode = new ListNode();
        head = outNode;
        int x, y;

        while (list1 != null && list2 != null) {
            x = list1.val;
            y = list2.val;
            System.out.println(list1.val + " " + list2.val);

            outNode.val = x;
            outNode.next = new ListNode();
            outNode = outNode.next;

            outNode.val = y;
            outNode.next = new ListNode();
            outNode = outNode.next;


            list1 = list1.next;
            list2 = list2.next;
        }
        System.out.println("=======");
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }

        return new ListNode();
    }
}