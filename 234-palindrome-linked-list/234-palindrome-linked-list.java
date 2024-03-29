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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        ListNode reversed = reverse(slow);
        
        slow = head;
        fast = reversed;
        
        while (fast != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
        
    }
    
    public ListNode reverse(ListNode node) {
        
        ListNode current = node.next;
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