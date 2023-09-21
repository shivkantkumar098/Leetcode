/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
       if (!head)
        return nullptr;

    // Create a mapping of original nodes to their corresponding copied nodes
    unordered_map<Node*, Node*> nodeMap;

    // First pass: create a copy of each node and store in the mapping
    Node* current = head;
    while (current) {
        nodeMap[current] = new Node(current->val);
        current = current->next;
    }

    // Second pass: update the next and random pointers of copied nodes using the mapping
    current = head;
    while (current) {
        nodeMap[current]->next = nodeMap[current->next];
        nodeMap[current]->random = nodeMap[current->random];
        current = current->next;
    }

    return nodeMap[head];
 
    }
};