import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {  // only start from the beginning of a sequence
                int currNum = num;
                int currStreak = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                longStreak = Math.max(longStreak, currStreak);
            }
        }

        return longStreak;
    }
}
