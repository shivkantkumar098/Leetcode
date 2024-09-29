import java.util.Vector;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Vector<Integer> res = new Vector<>();

        int i = 0, j = 0;
        
        // Merge elements from both arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res.add(nums1[i]);
                i++;
            } else {
                res.add(nums2[j]);
                j++;
            }
        }
        
        // Add remaining elements from nums1
        while (i < m) {
            res.add(nums1[i]);
            i++;
        }
        
        // Add remaining elements from nums2
        while (j < n) {
            res.add(nums2[j]);
            j++;
        }
        
        // Copy merged result back to nums1
        for (int k = 0; k < res.size(); k++) {
            nums1[k] = res.get(k);
        }
    }
}
