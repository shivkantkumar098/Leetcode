class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m = grid.size();    // Number of rows
        int n = grid[0].size(); // Number of columns

        // Create a 2D vector to store minimum path sums
        vector<vector<int>> routes(m, vector<int>(n, 0));

        // Initialize the starting point
        routes[0][0] = grid[0][0];

        // Calculate minimum path sums for the first row
        for (int i = 1; i < n; ++i) {
            routes[0][i] = routes[0][i - 1] + grid[0][i];
        }

        // Calculate minimum path sums for the first column
        for (int i = 1; i < m; ++i) {
            routes[i][0] = routes[i - 1][0] + grid[i][0];
        }

        // Fill in the rest of the routes array using the dynamic programming approach
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                routes[i][j] = min(routes[i - 1][j], routes[i][j - 1]) + grid[i][j];
            }
        }

        // The result will be in the bottom-right corner of the routes array
        return routes[m - 1][n - 1];
    }
};
