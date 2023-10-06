class Solution {
public:
    ListNode* reverse(ListNode* curr) {
        ListNode* prev = NULL;
        ListNode* next = NULL;
        while (curr != NULL) {
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    bool isPalindrome(ListNode* head) {
        if (head == NULL || head->next == NULL) return true;

        ListNode* slow = head;
        ListNode* fast = head;

        while (fast->next != NULL && fast->next->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;
        }

        slow->next = reverse(slow->next);
        ListNode* secondHalf = slow->next;
        slow->next = NULL;
        slow = secondHalf;

        ListNode* dummy = head;
        while (slow != NULL) {
            if (dummy->val != slow->val) {
                return false;
            }
            dummy = dummy->next;
            slow = slow->next;
        }

        return true;
    }
};
