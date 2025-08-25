class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        int prefixSum=0;
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            int rem=prefixSum%k;
            if(rem<0)rem+=k;
            if(mp.containsKey(rem)){
               cnt+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}