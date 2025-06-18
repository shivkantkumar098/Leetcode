class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[10001]; // to cover values from -5000 to +5000
        int offset = 5000;
        int k = 0;

        for (int i = 0; i < n; i++) {
            int shiftedVal = nums[i] + offset;
            if (!seen[shiftedVal]) {
                seen[shiftedVal] = true;
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
