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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        ListNode p1 = head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;
        
        while (fast != null && fast.next != null) {
            previous = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        previous.next = null;
        ListNode p2 = reverse(slow);
        ListNode p1next = null;
        ListNode p2next = null;
        
        while (p2 != null) {
            p1next = p1.next;
            p2next = p2.next;
            p1.next = p2;

            
            if (p1next == null) return;
            
            p2.next = p1next;
            p2 = p2next;
            p1 = p1next;
            
        }
        
        
        
        
    }
    
    public ListNode reverse(ListNode head) {
        
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
        
    }
}