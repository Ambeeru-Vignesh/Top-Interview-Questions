
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

class Solution {
    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(-1);
        int carry = 0;
        while (l1.next != null && l2.next != null) {
            int value = l1.val + l2.val;
            ListNode result = new ListNode(value);

        }

    }
}

class LinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        Solution.addTwoNumbers(head, head2);

    }
}