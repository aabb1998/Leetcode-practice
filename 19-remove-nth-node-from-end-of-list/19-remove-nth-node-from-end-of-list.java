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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        
        ListNode slow = newNode;
        ListNode fast = newNode;
        
        while (fast.next != null) {
            fast = fast.next;
            if (n-- <= 0) {
                slow = slow.next;
            }
        }
        
        slow.next = slow.next.next;
        
        return newNode.next;
        
    }
}