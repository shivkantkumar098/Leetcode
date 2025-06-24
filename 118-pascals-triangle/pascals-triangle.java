import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // By Binomial Expansion
        List<List<Integer>> triangle = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            long val = 1; // C(n, 0) = 1

            for (int k = 0; k <= n; k++) {
                row.add((int) val);
                // Use iterative binomial coefficient formula
                val = val * (n - k) / (k + 1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}
