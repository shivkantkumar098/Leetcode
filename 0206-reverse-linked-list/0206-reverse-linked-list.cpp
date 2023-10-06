class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* curr = head;
        ListNode* prev = nullptr;
        
        while (curr != nullptr) {
            ListNode* next = curr->next; // Store the next node temporarily
            curr->next = prev; // Reverse the pointer direction
            prev = curr; // Move prev to the current node
            curr = next; // Move curr to the next node
        }
        
        // At this point, prev will be the new head of the reversed list
        return prev;
    }
};
