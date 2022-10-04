package lists.leetcode._876_MiddleoftheLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            System.out.println(head.val);
            list.add(head);
            head = head.next;
        }

        int listSize = list.size();

        if (listSize < 2) {
            return list.get(0);
        }

        int a = (list.size() / 2);
        return list.get(a);
    }

    public ListNode middleNode2(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }

    public ListNode middleNode3(ListNode head) {
        {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    public static class ListNode {
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
}
