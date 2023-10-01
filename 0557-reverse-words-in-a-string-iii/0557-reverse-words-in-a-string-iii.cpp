class Solution {
public:
    string reverseWords(string s) {
        stack<char> wordStack;  // Create a stack to store characters of a word.
        vector<char> result;    // Create a vector to store the reversed words and spaces.

        for (char c : s) {
            if (c != ' ') {
                wordStack.push(c); // Push characters into the stack to form a word.
            } else {
                while (!wordStack.empty()) {
                    result.push_back(wordStack.top()); // Pop characters and add to result vector, effectively reversing the word.
                    wordStack.pop();
                }
                result.push_back(' '); // Add the space back to maintain word spacing.
            }
        }

        // Handle the last word (no trailing space)
        while (!wordStack.empty()) {
            result.push_back(wordStack.top());
            wordStack.pop();
        }

        return string(result.begin(), result.end()); // Convert the result vector to a string and return it.
    }
};