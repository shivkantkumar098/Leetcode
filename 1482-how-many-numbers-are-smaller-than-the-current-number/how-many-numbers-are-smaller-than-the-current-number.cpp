class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans;
        for(int i=0; i<n; i++){
            int temp = nums[i], count = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < temp){
                    count++;
                }
            }
            ans.push_back(count);
        }

        return ans;
    }
};