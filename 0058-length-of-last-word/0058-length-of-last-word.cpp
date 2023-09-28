class Solution {
public:
    int lengthOfLastWord(string s) {
        int cnt = 0;
        int n = s.size();
        
        // Start from the end of the string
        for (int i = n - 1; i >= 0; i--) {
            // Skip trailing spaces
            if (s[i] == ' ' && cnt == 0) {
                continue;
            }
            
            // If a non-space character is encountered, increment the count
            if (s[i] != ' ') {
                cnt++;
            }
            
            // If a space is encountered after the last word, break the loop
            if (s[i] == ' ' && cnt > 0) {
                break;
            }
        }
        
        return cnt;
    }
};
