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
    private:
    int f_position(vector<int>&inorder,int in_start,int in_end,int ele){
        for(int i=in_start;i<=in_end;i++){
            if(inorder[i]==ele){
                return i;
            }
        }
        return -1;
    }
        TreeNode* f(vector<int>& inorder, vector<int>& postorder, int& index, int in_start, int in_end) {
    if (index < 0 || in_start > in_end) {
        return nullptr;
    }
    int ele = postorder[index--];
    TreeNode* root = new TreeNode(ele);
    int position = f_position(inorder, in_start, in_end, ele);
    root->right = f(inorder, postorder, index, position + 1, in_end);
    root->left = f(inorder, postorder, index, in_start, position - 1);
    return root;
}

public:
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        int n=inorder.size();
        int pos_index=n-1;
        TreeNode* ans=f(inorder,postorder,pos_index,0,n-1);
        return ans;
    }
};