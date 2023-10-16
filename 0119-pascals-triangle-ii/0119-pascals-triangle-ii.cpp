class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row(rowIndex + 1, 1); // Initialize the row with 1's

        for (int i = 2; i <= rowIndex; i++) {
            int prev = 1; // Initialize the previous value
            for (int j = 1; j < i; j++) {
                int temp = row[j]; // Store the current value
                row[j] = prev + row[j]; // Update the current value
                prev = temp; // Update the previous value for the next iteration
            }
        }

        return row;
    }
};
