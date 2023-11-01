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
    void inorderTraversal(TreeNode* root, std::unordered_map<int, int>& freq, int& maxFreq) {
        if (root == nullptr) return;

        inorderTraversal(root->left, freq, maxFreq);

        // Count the frequency of the current node
        freq[root->val]++;
        maxFreq = std::max(maxFreq, freq[root->val]); // Update max frequency

        inorderTraversal(root->right, freq, maxFreq);
    }

    std::vector<int> findMode(TreeNode* root) {
        std::vector<int> modes;
        std::unordered_map<int, int> freq;
        int maxFrequency = 0;

        inorderTraversal(root, freq, maxFrequency); // Traverse the BST to count frequencies

        for (const auto& pair : freq) {
            if (pair.second == maxFrequency) {
                modes.push_back(pair.first); // Collect nodes with frequency equal to maxFrequency
            }
        }

        return modes;
    }
};
