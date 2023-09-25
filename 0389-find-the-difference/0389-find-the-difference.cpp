class Solution {
public:
    char findTheDifference(string s, string t) {
        char result = 0;

        for (char c : s) {
            result ^= c; // XOR operation cancels out characters that are the same
        }

        for (char c : t) {
            result ^= c; // XOR operation cancels out characters that are the same
        }

        return result;
    }
};
