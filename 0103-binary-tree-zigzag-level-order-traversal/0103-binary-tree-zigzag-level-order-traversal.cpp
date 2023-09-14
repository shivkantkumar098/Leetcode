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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>>ans;
        queue<TreeNode*>q;
        q.push(root);
        int count=0;
        if(root==NULL){
          return ans;
        }

        while(!q.empty()){
          int n=q.size();
          if(n==0){
            return ans;

          }
          count++;
          vector<int>level;
          for(int i=0;i<n;i++){
            TreeNode* node=q.front();
            q.pop();
            //level.push_back(node->val);
            if(node->left!=NULL){
              q.push(node->left);
            }
            if(node->right!=NULL){
              q.push(node->right);
            }
            // n--;
            level.push_back(node->val);
          }
        
        if(count%2==0)
        reverse(level.begin(),level.end());
        ans.push_back(level);
        }
        return ans;
    }
   
};