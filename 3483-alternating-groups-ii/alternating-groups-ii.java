class Solution {
       public int numberOfAlternatingGroups(int[] colors, int k) {
        int cnt = 0;
        for (int n = colors.length, lo = -1, hi = 1; hi < n + k - 1; ++hi) {
            if (colors[hi % n] == colors[(hi - 1) % n]) {
                lo = hi - 1;
            }else if (hi - lo >= k) {
                ++cnt;
            }
        }
        return cnt;
    }
}