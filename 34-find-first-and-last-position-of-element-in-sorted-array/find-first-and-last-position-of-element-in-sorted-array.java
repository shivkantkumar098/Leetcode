class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);   // find first occurrence
        int last = findIndex(nums, target, false);   // find last occurrence
        return new int[] {first, last};
    }

    private int findIndex(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1; // keep searching left
                } else {
                    low = mid + 1;  // keep searching right
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
