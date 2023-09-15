class Solution {
public:
    bool findTarget(TreeNode* root, int k) {
        unordered_set<int> seen;
        return hasPairWithSum(root, k, seen);
    }

private:
    bool hasPairWithSum(TreeNode* node, int k, unordered_set<int>& seen) {
        if (!node) {
            return false;
        }
        
        int complement = k - node->val;
        if (seen.find(complement) != seen.end()) {
            return true;
        }
        
        seen.insert(node->val);
        
        return hasPairWithSum(node->left, k, seen) || hasPairWithSum(node->right, k, seen);
    }
};
