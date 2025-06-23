class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int curSum=0;
        //     for(int j=i;j<n;j++){
        //         curSum+=nums[j];
        //         if(curSum>maxSum){
        //             maxSum=curSum;
        //         }
        //     }

        // }
        int curSum=0;
        for(int i=0;i<n;i++){
            curSum+=nums[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}