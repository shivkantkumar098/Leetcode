class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] < nums[i - 1]) {
                // If the current element is less than the previous one,
                // the previous element is a peak.
                return i - 1;
            }
        }
        
        // If the loop completes without finding a peak, the last element is a peak.
        return nums.size() - 1;
    }
};
