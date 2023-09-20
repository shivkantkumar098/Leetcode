class Solution {
public:
	ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
	// 	ListNode *ptr1 = headA;
	// 	ListNode *ptr2 = headB;
	// 	while(ptr1 != ptr2){
	// 		if(ptr1 == NULL){
	// 			ptr1 = headB;
	// 		}
	// 		else{
	// 			ptr1 = ptr1 -> next;
	// 		}
	// 		if(ptr2 == NULL){
	// 			ptr2 = headA;
	// 		}
	// 		else{
	// 			ptr2 = ptr2 -> next;
	// 		}
	// 	}
	// 	return ptr1;
    // Traverse the first linked list and store nodes in the map
    unordered_map<ListNode*, int> nodeMap;
    ListNode* currentA = headA;
    int index = 0;
    while (currentA != nullptr) {
        nodeMap[currentA] = index;
        index++;
        currentA = currentA->next;
    }

    // Traverse the second linked list and check if the node is in the map
    ListNode* currentB = headB;
    while (currentB != nullptr) {
        if (nodeMap.find(currentB) != nodeMap.end()) {
            return currentB;
        }
        currentB = currentB->next;
    }

    return nullptr; // No intersection found
}
	
};