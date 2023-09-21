class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* current = head;
        int count = 0;
        
        // Count the number of nodes in the current group
        while (current != nullptr && count < k) {
            current = current->next;
            count++;
        }
        
        // If there are at least k nodes, reverse them
        if (count == k) {
            current = reverseKGroup(current, k); // Recurse for the remaining nodes
            while (count > 0) {
                ListNode* temp = head->next;
                head->next = current;
                current = head;
                head = temp;
                count--;
            }
            head = current; // 'current' is now the new head of this k-group
        }
        
        return head;
    }
};
