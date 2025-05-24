class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    result.append(' ');
                    word.setLength(0);
                }
            }
        }

        // Append the last word if it exists
        if (word.length() > 0) {
            result.append(word.reverse());
        }

        // Trim trailing space if any
        int len = result.length();
        if (len > 0 && result.charAt(len - 1) == ' ') {
            result.deleteCharAt(len - 1);
        }

        return result.toString();
    }
}
