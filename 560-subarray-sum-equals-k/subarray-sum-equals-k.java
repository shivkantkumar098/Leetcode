class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int prefixSum=0;
        int cnt=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);//Base case :- prefix sum 0 exits once 

        for(int i=0;i<n;i++){
            prefixSum+=nums[i];

            // res=k=prefixSum[i]
            int res=prefixSum-k;
            if(map.containsKey(res)){
                cnt+=map.get(res);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);


        } 
        return cnt;      
    }
}