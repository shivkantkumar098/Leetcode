class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        List<Integer>res=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    res.add(i);
                    res.add(j);
                return res.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return new int[0]; 
    }
}