class Solution {
    public long distributeCandies(int n, int limit) {
        return countBoundedSolutions(n, limit);
    }

    // Helper to calculate C(n, k) safely
    private long nCk(int n, int k) {
        if (n < 0 || k < 0 || k > n) return 0;
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }

    private long countBoundedSolutions(int n, int limit) {
        // Total unrestricted solutions
        long total = nCk(n + 2, 2);

        // Subtract where one variable > limit
        total -= 3 * nCk(n - (limit + 1) + 2, 2); // pick any one > limit

        // Add back where two variables > limit (over-subtracted)
        total += 3 * nCk(n - 2 * (limit + 1) + 2, 2);

        // Subtract where all three > limit (if any)
        total -= nCk(n - 3 * (limit + 1) + 2, 2);

        return total;
    }
}
