import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;

        for (int num : nums) {
            if (visited.contains(num)) continue;

            visited.add(num);
            int currentLen = 1;

            // Expand left
            int left = num - 1;
            while (numSet.contains(left)) {
                visited.add(left);
                currentLen++;
                left--;
            }

            // Expand right
            int right = num + 1;
            while (numSet.contains(right)) {
                visited.add(right);
                currentLen++;
                right++;
            }

            maxLen = Math.max(maxLen, currentLen);
        }

        return maxLen;
    }
}
