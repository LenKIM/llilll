package lists.leetcode._142_linkedListCycle2;

/**
 * // 10:05
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode _2_node = new ListNode(2);
        head.next = _2_node;
        ListNode _0_node = new ListNode(0);
        _2_node.next = _0_node;
        ListNode _minus4_node = new ListNode(-4);
        _0_node.next = _minus4_node;
        _minus4_node.next = _2_node;

        ListNode listNode = new Solution().detectCycle(head);
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
