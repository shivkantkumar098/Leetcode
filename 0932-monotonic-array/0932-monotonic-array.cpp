class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        bool increasing = true;
        bool decreasing = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums[i] < nums[i+1]) {
                decreasing = false;
            } else if (nums[i] > nums[i+1]) {
                increasing = false;
            }
            
            // If both flags are false, no need to continue checking
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }
};
