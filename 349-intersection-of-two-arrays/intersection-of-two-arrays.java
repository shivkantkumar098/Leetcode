import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>(); // To store elements of nums1
        HashSet<Integer> resultSet = new HashSet<>(); // To store intersection results

        // Add all elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for intersection with nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num); // Add to result set if found
            }
        }

        // Convert resultSet to an array using toArray method
        return resultSet.stream().mapToInt(n->n).toArray();
    }
}
