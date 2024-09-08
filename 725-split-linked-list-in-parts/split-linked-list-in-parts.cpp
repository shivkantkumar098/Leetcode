/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
        
   




    // Step 1: Calculate the length of the linked list.
        int length = 0;
            ListNode* current = head;
                while (current) {
                        length++;
                                current = current->next;
                                    }

                                        // Calculate the size of each part.
                                            int partSize = length / k;
                                                int remainder = length % k;

                                                    // Step 2: Split the linked list.
                                                        current = head;
                                                            std::vector<ListNode*> result;

                                                                for (int i = 0; i < k; i++) {
                                                                        result.push_back(current);

                                                                                // Calculate the size of this part.
                                                                                        int partLength = partSize + (i < remainder ? 1 : 0);

                                                                                                // Move to the end of this part.
                                                                                                        for (int j = 1; j < partLength; j++) {
                                                                                                                    current = current->next;
                                                                                                                            }

                                                                                                                                    // Save the next node and cut the link to create the part.
                                                                                                                                            if (current) {
                                                                                                                                                        ListNode* nextNode = current->next;
                                                                                                                                                                    current->next = nullptr;
                                                                                                                                                                                current = nextNode;
                                                                                                                                                                                        }
                                                                                                                                                                                            }

                                                                                                                                                                                                return result;
                                                                                                                                                                                                }
};
