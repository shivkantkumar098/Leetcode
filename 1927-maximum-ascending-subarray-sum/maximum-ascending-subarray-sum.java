class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = 0, sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                res = Math.max(res, sum);
                sum = 0;
            }
            sum += nums[i];
        }

        return Math.max(res, sum);
    }
}
