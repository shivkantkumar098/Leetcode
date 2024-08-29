class Solution {
   
    public void sortColors(int[] nums) {
        
        int left=0,high=nums.length-1,mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                 int temp = nums[mid];
        nums[mid] = nums[left];
        nums[left] = temp;
                mid++;
                left++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
                high--;
            }
        }
        
    }
}