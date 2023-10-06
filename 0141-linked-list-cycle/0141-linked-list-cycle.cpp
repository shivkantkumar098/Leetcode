/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        // ListNode*fast=head;
        //  ListNode* slow=head;
        //  while(fast!=NULL && fast->next!=NULL)
        //  {
        //      fast=fast->next->next;
        //      slow=slow->next;
        //      if(slow==fast)
        //       return true;
        //  }
        //  return false;
         unordered_set<ListNode*> hashTable;
    while(head != NULL) {
        if(hashTable.find(head) != hashTable.end()) return true;
        else
        hashTable.insert(head);
        head = head->next;
    }
    return false;

        
    }
};