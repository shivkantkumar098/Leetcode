import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        long maxSum = 0, currSum = 0;
        int i = 0, j = 0;

        while (j < n) {
            // If nums[j] is already in set, remove from left until it's not
            while (set.contains(nums[j])) {
                set.remove(nums[i]);
                currSum -= nums[i];
                i++;
            }

            // Add new element to window
            set.add(nums[j]);
            currSum += nums[j];

            // Check if window size is k
            if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, currSum);
                // Slide window
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            j++;
        }

        return maxSum;
    }
}
