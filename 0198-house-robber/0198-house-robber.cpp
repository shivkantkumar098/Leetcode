class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<int> memo(n, -1); // Initialize memoization array with -1

        return robHelper(nums, n - 1, memo);
    }

    int robHelper(vector<int>& nums, int index, vector<int>& memo) {
        if (index < 0) {
            return 0;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        // The maximum amount that can be robbed at the current house is the maximum of:
        // 1. Robbing the current house and skipping the previous house.
        // 2. Skipping the current house and robbing the previous house.
        int robCurrentHouse = nums[index] + robHelper(nums, index - 2, memo);
        int skipCurrentHouse = robHelper(nums, index - 1, memo);

        // Store the maximum amount in the memoization array for reuse.
        memo[index] = max(robCurrentHouse, skipCurrentHouse);
        return memo[index];
    }
};
