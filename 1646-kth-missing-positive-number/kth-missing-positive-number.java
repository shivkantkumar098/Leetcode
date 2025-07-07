class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missingNo=arr[mid]-(mid+1);
            if(missingNo<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }
}