class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int count=0;
        int i=0;
        while(i<n){
            // for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                
            }
            else{
                count=0;
            }
            i++;
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}