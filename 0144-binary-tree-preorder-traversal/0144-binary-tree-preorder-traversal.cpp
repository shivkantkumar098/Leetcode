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
    vector<int> preorderTraversal(TreeNode* root) {
    //     vector<int>res;
    //      stack<TreeNode*>st;
    //     if(root==NULL){
    //         return res;
    //     }
       
    //     st.push(root);
    //     while(!st.empty()){
    //         root=st.top();
    //         st.pop();
    //         res.push_back(root->val);
    //         if(root->right!=NULL)
    //             st.push(root->right);
    //         if(root->left!=NULL)
    //             st.push(root->left);
    //     }
        
    // return res
    // vector<int>res;
    // stack<TreeNode*>st;
    // if(root==NULL){
    //     return res;
    // }
    // st.push(root);
    // while(!st.empty()){
    //     TreeNode* newN=st.top();
    //     st.pop();
    //     res.push_back(newN->val);
    //     if(newN->right!=NULL){
    //         st.push(newN->right);

    //     }
    //      if(newN->left!=NULL){
    //         st.push(newN->left);


    //     }

    // }
    // return res;
    vector<int>res;
    stack<TreeNode*>st;
    if(root==nullptr){
        return res;
    }
    st.push(root);
    while(!st.empty()){
        TreeNode* node=st.top();
        st.pop();
        res.push_back(node->val);
        if(node->right!=nullptr){
            st.push(node->right);
        }
        if(node->left!=nullptr){
            st.push(node->left);
        }

        
    }
    return res;
    
    }
};