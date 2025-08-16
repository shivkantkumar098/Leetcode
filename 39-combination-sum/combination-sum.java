
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void helper(int[] candidates, int target, int i, int curSum, List<Integer> temp) {
        // bounding condition
        if (curSum > target) {
            return;
        }
        // base case
        if (i == candidates.length) {
            if (curSum == target) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        // Inclusion
        temp.add(candidates[i]);
        helper(candidates, target, i, curSum + candidates[i], temp);
        temp.remove(temp.size() - 1);

        // Exclusion
        helper(candidates, target, i + 1, curSum, temp);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }
}
