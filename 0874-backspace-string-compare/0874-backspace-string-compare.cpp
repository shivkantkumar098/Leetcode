class Solution {
public:
    bool backspaceCompare(string s, string t) {
        return buildString(s) == buildString(t);
    }

    string buildString(string str) {
        string result;
        for (char ch : str) {
            if (ch != '#') {
                result.push_back(ch);
            } else if (!result.empty()) {
                result.pop_back();
            }
        }
        return result;
    }
};
