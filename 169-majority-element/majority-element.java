class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int ca=0;
        for(int i:nums){
            if(c==0){
                
                ca=i;
            }
            if(i==ca){
                c++;
            }
            else{
                c--;
            }

        }
        return ca;

    }
}