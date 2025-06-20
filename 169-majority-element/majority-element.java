class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int candidate=nums[0];
        int c=0;
        for(int i:nums){
            if(c==0){
                candidate=i;
            }
            if(i==candidate){
                c++;
            }
            else{
                c--;
            }
        }
        return candidate;
    }
}