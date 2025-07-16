class Solution {
    // Definition for singly-linked list:
    // public static class ListNode {
    //     int val;
    //     ListNode next;
    //     ListNode() {}
    //     ListNode(int val) { this.val = val; }
    //     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    // }

    public static ListNode middleNodeFn(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow; // must return middle
    }

    public static ListNode reverse(ListNode curr, ListNode prev) {
        if (curr == null) return prev;
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next, curr);
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode middleNode = middleNodeFn(head);
        ListNode reversedSecondHalf = reverse(middleNode, null);

        ListNode first = head;
        ListNode second = reversedSecondHalf;

        while (second != null) {
            if (first.val != second.val) {
                // Restore the list before returning
                reverse(reversedSecondHalf, null);
                return false;
            }
            first = first.next;
            second = second.next;
        }

        // Optional: Restore the list
        reverse(reversedSecondHalf, null);
        return true;
    }
}
