class Solution {
public:
    bool find132pattern(vector<int>& nums) {
        // Check if the length of the input array is less than 3
        if (nums.size() < 3) {
            return false;
        }
        
        int prevMin = INT_MIN; // Initialize prevMin to negative infinity
        int potentialPeak = nums.size();
        
        // Loop through the array from right to left
        for (int i = nums.size() - 1; i >= 0; i--) {
            // If the current element is less than prevMin, return true (132 pattern found)
            if (nums[i] < prevMin) {
                return true;
            }
            
            // Search for a potential peak value in the right portion of the array
            while (potentialPeak < nums.size() && nums[i] > nums[potentialPeak]) {
                prevMin = nums[potentialPeak++];
            }
            
            // Decrement potentialPeak to get the correct position
            potentialPeak--;
            
            // Update nums[potentialPeak] with the current nums[i] value
            nums[potentialPeak] = nums[i];
        }
        
        // If the loop completes without finding a 132 pattern, return false
        return false;
    }
};
