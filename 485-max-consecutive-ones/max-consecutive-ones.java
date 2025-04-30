class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n=nums.length;
     int noOfOne=0;
     int maxi_one=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        if(nums[i]==1){
            noOfOne++;
        }
        else{
            noOfOne=0;
        }
        maxi_one=Math.max(maxi_one,noOfOne);
     }   
     return maxi_one;
    }
}