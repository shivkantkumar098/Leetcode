class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] ans = new int[n];
        long prefixMod = 0;

        for (int i = 0; i < n; i++) {
            int digit = word.charAt(i) - '0';
            prefixMod = (prefixMod * 10 + digit) % m;

            if (prefixMod == 0) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
