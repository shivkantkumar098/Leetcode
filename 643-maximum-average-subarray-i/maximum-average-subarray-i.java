class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double window_Sum=0;
        double n=nums.length;
        for (int i = 0; i < k; i++) {
            window_Sum += nums[i];
        }

        double avg_sum=window_Sum;
        for(int i=k;i<n;i++){
             avg_sum+=nums[i]-nums[i-k];// adding new and delete added one
            window_Sum=Math.max(window_Sum,avg_sum);
        }
        return window_Sum/k;
    }

    
}