

class Solution {
public:
    int solve(int ind, unordered_set<string>& st, string& s, vector<int>& dp) {
        if (ind >= s.size()) return 0;
        if (dp[ind] != -1) return dp[ind];

        int mini = s.size();

        for (int i = ind; i < s.length(); i++) {
            string temp = s.substr(ind, i - ind + 1);

            int currE = 0;
            if (st.find(temp) == st.end()) {
                currE = temp.size();
            }

            int nExtra = solve(i + 1, st, s, dp);
            mini = min(mini, currE + nExtra);
        }
        return dp[ind] = mini;
    }

    int minExtraChar(string s, vector<string>& dictionary) {
        unordered_set<string> st(dictionary.begin(), dictionary.end());
        vector<int> dp(s.size(), -1);

        int ans = solve(0, st, s, dp);
        return ans;
    }
};
