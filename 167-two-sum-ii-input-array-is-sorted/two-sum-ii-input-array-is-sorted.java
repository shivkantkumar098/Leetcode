class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0,j=numbers.length-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
        // int n = numbers.length;
        // HashMap<Integer, Integer> mp = new HashMap<>(n);
        
        // for (int i = 0; i < n; i++) {
        //     int complement = target - numbers[i];
        //     if (mp.containsKey(complement)) {
        //         return new int[]{mp.get(complement) + 1, i + 1}; // 1-based indices
        //     }
        //     mp.put(numbers[i], i);
        // }
        // return new int[0]; 
    }
}