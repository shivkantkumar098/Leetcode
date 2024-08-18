public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Detecting cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) { // Cycle detected
                ListNode entry = head;
                
                // Finding the entry point of the cycle
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                
                return entry;
            }
        }
        
        return null; // No cycle found
    }
}
