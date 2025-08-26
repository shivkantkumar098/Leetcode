import java.util.HashMap;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;
        
        // map to store frequency of prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case
        
        for (int num : nums) {
            // convert odd to 1, even to 0
            prefixSum += (num % 2);
            
            // check if prefixSum - k exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            
            // store prefix sum frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
