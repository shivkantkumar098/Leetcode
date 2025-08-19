import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates
        Set<List<Integer>> set = new HashSet<>(); // to avoid duplicates
        helper(nums, 0, new ArrayList<>(), set);

        return new ArrayList<>(set); // convert back to List
    }

    private void helper(int[] nums, int i, List<Integer> current, Set<List<Integer>> set) {
        if (i == nums.length) {
            set.add(new ArrayList<>(current)); // add one subset
            return;
        }

        // Not take
        helper(nums, i + 1, current, set);

        //Take
        current.add(nums[i]);
        helper(nums, i + 1, current, set);
        current.remove(current.size() - 1); // backtrack
    }
}
