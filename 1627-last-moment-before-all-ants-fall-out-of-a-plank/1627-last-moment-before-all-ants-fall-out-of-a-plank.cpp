class Solution {
public:
    int getLastMoment(int n, vector<int>& left, vector<int>& right) {
        int lastMoment = 0;

        // Finding the last moment when an ant falls off from the left side
        if (!left.empty()) {
            int maxLeft = *max_element(left.begin(), left.end());
            lastMoment = max(lastMoment, maxLeft);
        }

        // Finding the last moment when an ant falls off from the right side
        if (!right.empty()) {
            int minRight = *min_element(right.begin(), right.end());
            lastMoment = max(lastMoment, n - minRight);
        }

        return lastMoment;
    }
};