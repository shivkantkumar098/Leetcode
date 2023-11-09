class Solution {
public:
    int countHomogenous(string s) {
                const int MOD = 1e9 + 7;
        long long count = 0;
        long long consecCount = 1;

        for (int i = 0; i < s.length(); ++i) {
            if (i < s.length() - 1 && s[i] == s[i + 1]) {
                consecCount++; // Increment the count of consecutive characters
            } else {
                count = (count + (consecCount * (consecCount + 1)) / 2) % MOD; // Count the number of substrings formed by consecutive characters
                consecCount = 1; // Reset the consecutive count
            }
        }

        return static_cast<int>(count);
    }
};
