/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ind = 0;

    TreeNode* f(vector<int>& preorder, vector<int>& inorder, int start, int end) {
        if (start > end) {
            return nullptr;
        }
        TreeNode* root = new TreeNode(preorder[ind++]);
        int sp = 0;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == preorder[ind - 1]) { 
                sp = i;
                break;
            }
        }
        root->left = f(preorder, inorder, start, sp - 1);
        root->right = f(preorder, inorder, sp + 1, end);
        return root;
    }

    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return f(preorder, inorder, 0, inorder.size() - 1);
    }
};
