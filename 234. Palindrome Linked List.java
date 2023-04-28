/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        int i = 1;
        while (temp != null) {
            map.put(i, temp.val);
            temp = temp.next;
            i++;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        temp = prev;
        int a = 1;
        while (temp != null) {

            if (temp.val == map.get(a)) {
                temp = temp.next;
                a++;
            } else {
                return false;
            }
        }

        return true;

    }
}