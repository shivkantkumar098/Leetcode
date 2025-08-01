class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        return sumOfSubarrayMax(nums, n) - sumOfSubarrayMin(nums, n);
    }

    private long sumOfSubarrayMin(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        long res = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || arr[st.peek()] > arr[i])) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                res += (long) arr[mid] * (mid - left) * (right - mid);
            }
            st.push(i);
        }

        return res;
    }

    private long sumOfSubarrayMax(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        long res = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || arr[st.peek()] < arr[i])) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                res += (long) arr[mid] * (mid - left) * (right - mid);
            }
            st.push(i);
        }

        return res;
    }
}
