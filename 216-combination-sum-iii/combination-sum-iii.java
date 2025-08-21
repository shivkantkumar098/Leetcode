class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void helper(int num, int k, int n, int curSum, int count, List<Integer> temp) {
        // bounding conditions
        if (curSum > n || count > k) return;
        if (num > 9) {
            if (curSum == n && count == k) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        // Inclusion
        temp.add(num);
        helper(num + 1, k, n, curSum + num, count + 1, temp);
        temp.remove(temp.size() - 1);

        // Exclusion
        helper(num + 1, k, n, curSum, count, temp);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(1, k, n, 0, 0, new ArrayList<>());
        return ans;
    }
}
