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
    int f_position(vector<int>&inorder,int in_start,int in_end,int element,int n){
        for(int i=in_start;i<=in_end;i++){
            if(inorder[i]==element){
                return i;
            }

        }
        return -1;
    }
    TreeNode* f(vector<int>&preorder,vector<int>&inorder,int &index,int in_start,int in_end,int n){
        if(index>n || in_start>in_end){
            return nullptr;
        }
        int element=preorder[index++];
        TreeNode* root=new TreeNode(element);
        int position=f_position(inorder,in_start,in_end,element,n);
        root->left=f(preorder,inorder,index,in_start,position-1,n);
        root->right=f(preorder,inorder,index,position+1,in_end,n);
        return root;
    }
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        int n=inorder.size();
        int pre_index=0;
        TreeNode* ans=f(preorder,inorder,pre_index,0,n-1,n);
        return ans;
    }
};