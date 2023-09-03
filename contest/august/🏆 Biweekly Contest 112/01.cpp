

class Solution {
public:
    bool canBeEqual(string s1, string s2) {
        if (s1.size() != s2.size()) {
            return false; // If the lengths are different, they cannot be made equal
        }

        unordered_map<char, int> evenIndexFreq; // Frequency map for characters at even indices
        unordered_map<char, int> oddIndexFreq;  // Frequency map for characters at odd indices

        // Populate frequency maps for s1
        for (int i = 0; i < s1.size(); i++) {
            if (i % 2 == 0) {
                evenIndexFreq[s1[i]]++;
            } else {
                oddIndexFreq[s1[i]]++;
            }
        }

        // Update frequency maps for s2 (subtracting)
        for (int i = 0; i < s2.size(); i++) {
            if (i % 2 == 0) {
                evenIndexFreq[s2[i]]--;
            } else {
                oddIndexFreq[s2[i]]--;
            }
        }

        // Check if the frequency maps are empty (all characters match)
        for (auto& pair : evenIndexFreq) {
            if (pair.second != 0) {
                return false; // If any character's frequency is non-zero, return false
            }
        }

        for (auto& pair : oddIndexFreq) {
            if (pair.second != 0) {
                return false; // If any character's frequency is non-zero, return false
            }
        }

        return true; // If all characters match, return true
    }
};
