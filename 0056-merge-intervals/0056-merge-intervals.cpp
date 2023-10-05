class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        // Step 1: Sort the intervals based on the start values.
        sort(intervals.begin(), intervals.end());
        
        // Step 2: Initialize a vector to store merged intervals.
        vector<vector<int>> merged;
        
        // Step 3: Get the number of intervals.
        int n = intervals.size();
        
        // Step 4: Iterate through the sorted intervals.
        for (int i = 0; i < n; i++) {
            // Step 5: Check for overlap or non-overlap and merge accordingly.
            if (merged.empty() || merged[merged.size() - 1][1] < intervals[i][0]) {
                vector<int> v = {intervals[i][0], intervals[i][1]};
                merged.push_back(v); // Create a new interval and add to merged.
            } else {
                // Step 6: Merge overlapping intervals by updating the end value.
                merged[merged.size() - 1][1] = max(merged[merged.size() - 1][1], intervals[i][1]);
            }
        }
        
        // Step 7: Return the merged intervals.
        return merged;
    }
};
