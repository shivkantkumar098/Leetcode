class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
    vector<vector<int>> result;
    int n = nums.size();
    // -1,0,1,2,-1,-4
    if (n < 3) {
        return result; // Not enough elements to form a triplet
    }
    // -4 -1 -1 0 1 2
    sort(nums.begin(), nums.end());

    for (int i = 0; i < n - 2; ++i) {
        
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue; // Skip duplicate values
        }
            // -4 -1 -1 0 1 2 
        int left = i + 1; // l=-1
        int right = n - 1; // r= 2

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                result.push_back({nums[i], nums[left], nums[right]});
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    return result;
}
};