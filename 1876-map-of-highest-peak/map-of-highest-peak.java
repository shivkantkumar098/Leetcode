class Solution {
       private static final int[] d = {0, 1, 0, -1, 0};
    public int[][] highestPeak(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] heights = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                if (A[r][c] == 1) { // Water found.
                    heights[r][c] = 0; // Set the height to 0.
                    q.offer(new int[]{r, c}); // put its position into Queue as one of the starting points of BFS.
                }else {
                    heights[r][c] = -1; // Mark the land by -1.
                }
            }
        }
        while (!q.isEmpty()) {
            int[] pos = q.poll(); // Current position.
            int r = pos[0], c = pos[1];
            for (int k = 0; k < 4; ++k) { // Traverse its neighbors.
                int x = r + d[k], y = c + d[k + 1];
                if (0 <= x && x < m && 0 <= y && y < n && heights[x][y] < 0) { // Found a neighbor land.
                    heights[x][y] = heights[r][c] + 1; // Its neighbor height value is at most 1 bigger.
                    q.offer(new int[]{x, y}); // put its position into Queue for next round of BFS.
                }            
            }
        }
        return heights;
    }
}