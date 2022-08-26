/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        
        
        while(head != null) {
            System.out.println(head.val);
            list.add(head);
            head = head.next;
        }
        
        int listSize = list.size();
        
        if (listSize < 2) {
            return list.get(0);
        }
        
        if ((listSize % 2) == 0) {
            int a = (list.size() / 2);
            return list.get(a);
            
        } else {
            
            int a = (list.size() / 2);
            return list.get(a);
        }
    };
}