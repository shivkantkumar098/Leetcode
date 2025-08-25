class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n + 1];

        // prefix XOR
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }

        int m = queries.length;
        int[] ans = new int[m];

        // Answer queries
        for (int i = 0; i < m; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            ans[i] = prefix[R + 1] ^ prefix[L];
        }

        return ans;
    }
}
