class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        List<Integer>res=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>(n);
        for(int i=0;i<n;i++){
            int f=target-nums[i];
            if(mp.containsKey(f)){
                   res.add(mp.get(f));
                   res.add(i);
                    return res.stream().mapToInt(Integer::intValue).toArray();
            }
            mp.put(nums[i],i);
        }
        return new int[0];
    }
}