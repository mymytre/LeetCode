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

        ListNode head, end = null;
        ListNode tmp = new ListNode();
        head = tmp;
        int x, y;

        while (list1 != null && list2 != null) {
            x = list1.val;
            y = list2.val;

            if (x >= y) {
                tmp.val = y;
                tmp.next = new ListNode();
                tmp = tmp.next;
                tmp.val = x;
            } else {
                tmp.val = x;
                tmp.next = new ListNode();
                tmp = tmp.next;
                tmp.val = y;
            }
            end = tmp;


            tmp.next = new ListNode();
            tmp = tmp.next;

            list1 = list1.next;
            list2 = list2.next;
        }
        assert end != null;
        end.next = null;


        return head;
    }
}