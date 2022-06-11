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

        ListNode z = new ListNode(4);
        ListNode y = new ListNode(2, z);
        ListNode x = new ListNode(1, y);

        ListNode c = new ListNode(4);
        ListNode b = new ListNode(3, c);
        ListNode a = new ListNode(1, b);

        ListNode node = null;
        ListNode node1 = null;

        ListNode test = solution021.mergeTwoLists(a, x);


        while (test != null) {
            System.out.print(test.val + " ");
            test = test.next;
        }

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode();
        ListNode tmp = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        if(list1 == null) {
            tmp.next = list2;
        } else {
            tmp.next = list1;
        }
        return head.next;
    }
}