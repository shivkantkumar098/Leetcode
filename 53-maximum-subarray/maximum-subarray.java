class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            if(ans>maxi){
                maxi=ans;
            }
            if(ans<0){
                ans=0;
            }
        }
        return maxi;
    }
}