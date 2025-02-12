class Solution {
    public int maximumSum(int[] nums) {
        int res = -1;
        int[] d_n = new int[82]; // Array to store max values for each digit sum

        for (int n : nums) {
            int d = 0, temp = n;
            while (temp > 0) {
                d += temp % 10;
                temp /= 10;
            }
            if (d_n[d] > 0)
                res = Math.max(res, d_n[d] + n);
            d_n[d] = Math.max(d_n[d], n);
        }
        return res;
    }
}