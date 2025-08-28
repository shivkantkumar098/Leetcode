import java.util.*;

class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) total += num;

        int target = total - x;
        if (target < 0) return -1;   // can't remove enough
        if (target == 0) return n;   // must remove all

        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 

        int sum = 0, maxLen = -1;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (map.containsKey(sum - target)) {
                int prevIndex = map.get(sum - target);
                maxLen = Math.max(maxLen, i - prevIndex);
            }
            // store first occurrence of this sum
            map.putIfAbsent(sum, i);
        }

        return maxLen == -1 ? -1 : n - maxLen;
    }
}
