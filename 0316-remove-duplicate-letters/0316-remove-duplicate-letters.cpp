class Solution {
public:
    string removeDuplicateLetters(string s) {
        unordered_map<char, bool> seen; // To keep track of characters seen so far
        unordered_map<char, int> lastOccurrence; // To store the last occurrence index of each character
        string result = "";

        // Populate lastOccurrence with the last index where each character occurs
        for (int i = 0; i < s.size(); i++) {
            lastOccurrence[s[i]] = i;
        }

        for (int i = 0; i < s.size(); i++) {
            char currentChar = s[i];

            if (!seen[currentChar]) {
                // While there are characters in the result string and the current character is smaller
                // and there are more occurrences of the characters later in the string,
                // remove characters from the result to ensure the smallest lexicographical order
                while (!result.empty() && currentChar < result.back() && i < lastOccurrence[result.back()]) {
                    seen[result.back()] = false;
                    result.pop_back();
                }

                seen[currentChar] = true;
                result.push_back(currentChar); // Add the current character to the result
            }
        }

        return result;
    }
};
