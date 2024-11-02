import java.util.*;
class Solution {
    public boolean isCircularSentence(String sentence) {
        // String [] words=sentence.spilt(" ");
        String[] words = sentence.split(" ");
        int n=words.length;
        
        for (int i = 0; i < n; i++) {
          if (words[i].charAt(words[i].length() - 1) != words[(i + 1) % n].charAt(0)) {
                return false; // Not circular
            }
        }

        return words[n - 1].charAt(words[n - 1].length() - 1) == words[0].charAt(0);
    }
}