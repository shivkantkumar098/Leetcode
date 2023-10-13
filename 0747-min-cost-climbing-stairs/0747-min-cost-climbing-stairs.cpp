class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
                int n = cost.size();
        vector<int> dp(n + 1);

        for (int i = 2; i <= n; i++) {
            dp[i] = std::min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[n];
    //         int minCostClimbingStairs(vector<int>& cost) {
    //     return min(minCost(cost, 0), minCost(cost, 1));
    // }

    // int minCost(const vector<int>& cost, int step) {
    //     if (step >= cost.size())
    //         return 0;
        
    //     int cost1 = cost[step] + minCost(cost, step + 1);
    //     int cost2 = cost[step] + minCost(cost, step + 2);

    //     return min(cost1, cost2);

    }
};