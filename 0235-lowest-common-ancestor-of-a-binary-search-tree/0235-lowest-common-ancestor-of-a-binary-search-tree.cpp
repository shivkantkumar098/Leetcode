/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        if (root == nullptr) {
            return nullptr;
        }

        int rootVal = root->val;
        int pVal = p->val;
        int qVal = q->val;

        if (pVal < rootVal && qVal < rootVal) {
            // Both p and q are in the left subtree
            return lowestCommonAncestor(root->left, p, q);
        } else if (pVal > rootVal && qVal > rootVal) {
            // Both p and q are in the right subtree
            return lowestCommonAncestor(root->right, p, q);
        } else {
            // p and q are in different subtrees or one of them is equal to root
            return root;
        }
    }
};
