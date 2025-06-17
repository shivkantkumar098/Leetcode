class Solution {
    public int findGCD(int[] nums) {
        // find min and max
        int maxi=nums[0];
        int mini=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini=nums[i];
            }
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        // find GCD or HCF
        while(mini!=0){
            int temp=mini;
            mini=maxi%mini;
            maxi=temp;
        }
        return maxi;
    }
}