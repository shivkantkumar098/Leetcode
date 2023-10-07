

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
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        // Create a map to store values at each vertical and horizontal level.
        // Use a multiset to store values since we want to maintain sorted order.
        map<int, map<int, multiset<int>>> mp;

        // Create a queue for level-order traversal with each node's coordinates.
        queue<pair<TreeNode*, pair<int, int>>> q;
        // Initialize the queue with the root node at (0, 0).
        q.push({root, {0, 0}});

        // Perform a level-order traversal of the binary tree.
        while (!q.empty()) {
            auto iti = q.front();
            q.pop();
            TreeNode* temp = iti.first;
            // Separate the vertical and horizontal coordinates.
            int x = iti.second.first;
            int y = iti.second.second;
            // Insert the node's value into the map at the corresponding coordinates.
            mp[x][y].insert(temp->val);

            // Explore the left and right children.
            if (temp->left) {
                // Decrement the horizontal coordinate (move left) and increment the vertical coordinate (move down).
                q.push({temp->left, {x - 1, y + 1}});
            }
            if (temp->right) {
                // Increment the horizontal coordinate (move right) and increment the vertical coordinate (move down).
                q.push({temp->right, {x + 1, y + 1}});
            }
        }

        // Prepare the final result.
        vector<vector<int>> ans;
        // Iterate through the map in sorted order of vertical coordinates.
        for (auto it : mp) {
            vector<int> col;
            // Iterate through the map at each vertical coordinate.
            for (auto i : it.second) {
                // Append the values from the multiset to the column.
                col.insert(col.end(), i.second.begin(), i.second.end());
            }
            // Add the column to the result.
            ans.push_back(col);
        }

        return ans;
    }
};
