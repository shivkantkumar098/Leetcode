

class Solution {
public:
    int calculateMinimumHP(vector<vector<int>>& dungeon) {
        int n = dungeon.size();
        int m = dungeon[0].size();
        vector<vector<int>> dp(n, vector<int>(m));

        // Calculate the initial minimum HP needed at the princess cell (bottom-right)
        dp[n - 1][m - 1] = dungeon[n - 1][m - 1] < 0 ? (-dungeon[n - 1][m - 1] + 1) : 1;

        // Fill in the DP table starting from the princess cell and moving towards the knight's position
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    continue; // Skip the princess cell (already calculated)
                }
                if (i == n - 1) {
                    // If in the last row, consider moving right
                    int neededHP = dp[i][j + 1] - dungeon[i][j];
                    dp[i][j] = max(neededHP, 1);
                } else if (j == m - 1) {
                    // If in the last column, consider moving down
                    int neededHP = dp[i + 1][j] - dungeon[i][j];
                    dp[i][j] = max(neededHP, 1);
                } else {
                    // If not on the last row or last column, consider both right and down paths
                    int neededHP = min(dp[i][j + 1], dp[i + 1][j]) - dungeon[i][j];
                    dp[i][j] = max(neededHP, 1);
                }
            }
        }

        // Return the minimum initial HP needed at the knight's position (top-left)
        return dp[0][0];
    }
};
