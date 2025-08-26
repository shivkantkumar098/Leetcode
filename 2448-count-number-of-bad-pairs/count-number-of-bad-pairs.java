class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long goodPair=0;
        long totalPair = (long)n * (n - 1) / 2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=nums[i]-i;
            if(map.containsKey(key)){
                goodPair+=map.get(key);
            }
            map.put(key,map.getOrDefault(key,0)+1);

        }
        return totalPair-goodPair;
    }
}