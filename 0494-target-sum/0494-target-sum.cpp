class Solution {
public:
    int count = 0;

void calculate(vector<int>& nums, int target, int idx, int sum,vector<vector<int>> 
&dp){
    if (idx == nums.size()) {  // base case
        if (sum == target) {
            count++;
        }
        return;
    }
    
    calculate(nums, target, idx+1, sum+nums[idx],dp);  // add current number with +
    calculate(nums, target, idx+1, sum-nums[idx],dp);  // subtract current number with -
}

int findTargetSumWays(vector<int>& nums, int target) {
	int n=nums.size();
	  vector<vector<int>> dp(n,vector<int>(n+1,-1));
    calculate(nums, target, 0, 0,dp);
    return count;
}

};