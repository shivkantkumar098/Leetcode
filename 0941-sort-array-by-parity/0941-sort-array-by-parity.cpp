class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int> res;
        
        // Traverse the input vector and push even numbers to 'res'
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] % 2 == 0) {
                res.push_back(nums[i]);
            }
        }
        
        // Traverse the input vector again and push odd numbers to 'res'
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] % 2 != 0) {
                res.push_back(nums[i]);
            }
        }
        
        return res;
    }
};
