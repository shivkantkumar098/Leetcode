class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        // int value=mp.getOrDefault(nums[i],0);
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
     }   
     for(Map.Entry<Integer,Integer>it:mp.entrySet()){
        if(it.getValue()>nums.length/3){
            
            res.add(it.getKey());
        }
     }
     return res;
    }
}