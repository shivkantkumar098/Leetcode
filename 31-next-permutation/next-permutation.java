class Solution {
    public static void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }
    public static void reverse(int nums[],int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        // find break point
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
           reverse(nums,0,n-1);
           return;
        }
        //Find next greater element and swap it with nums[ind]
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                    swap(nums,i,ind);
                    break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
}