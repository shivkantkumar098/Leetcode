class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[] position = new int[n * m];
        int[] rowSum = new int[m];
        int[] colSum = new int[n];

        Arrays.fill(rowSum, n);
        Arrays.fill(colSum, m);

        // Map matrix values to their positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                position[mat[i][j] - 1] = i * m + j;
            }
        }

        // Process the marking based on arr
        for (int i = 0; i < arr.length; i++) {
            int ind = position[arr[i] - 1];
            int x = ind / m, y = ind % m;

            rowSum[y]--;
            colSum[x]--;

            if (rowSum[y] == 0 || colSum[x] == 0) {
                return i;
            }
        }
        return -1;
    }
}