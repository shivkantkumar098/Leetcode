class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        // int i=0,j=n-1;
        // while(i<j){
        //     int sum=numbers[i]+numbers[j];
        //     if(sum==target){
        //         return new int[]{i+1,j+1};
        //     }
        //     else if(sum<target){
        //         i++;
        //     }else{
        //         j--;
        //     }
          
        // }
        // return new int[]{-1,-1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement)+1,i+1};
            }
            mp.put(numbers[i],i);
        }
        return new int[]{-1,-1};

    }
}