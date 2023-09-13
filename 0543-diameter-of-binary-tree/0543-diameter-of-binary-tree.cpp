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
    int diameterOfBinaryTree(TreeNode* root) {
        int d=0;
        hi(root,d);
        return d;
        
    }
    private:
    int hi(TreeNode* root,int &d){
        if(!root)
        return 0;
        int l=hi(root->left,d);
        int h=hi(root->right,d);
        d=max(d,l+h);
        return 1+max(l,h);
    }
};