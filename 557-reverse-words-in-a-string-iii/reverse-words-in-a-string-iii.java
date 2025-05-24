class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch != ' ') {
                word.append(ch);
            } else {
                result.append(word.reverse()); // reverse the current word
                result.append(' ');            // add the space
                word.setLength(0);             // clear word builder
            }
        }
        
        // Append the last word (since no space after it)
        result.append(word.reverse());
        
        return result.toString();
    }
}
