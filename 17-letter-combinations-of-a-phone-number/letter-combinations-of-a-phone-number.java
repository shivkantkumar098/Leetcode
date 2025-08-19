import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>(); 
        }

        String[] keys = {"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        helper(digits, 0, "", ans, keys);
        return ans;
    }

    private void helper(String digits, int i, String current, List<String> ans, String[] keys) {
        if (i == digits.length()) {
            ans.add(current); // base case: formed one combination
            return;
        }

        int digit = digits.charAt(i) - '0'; // convert char -> int index
        String letters = keys[digit];       // mapping

        for (int j = 0; j < letters.length(); j++) {
            helper(digits, i + 1, current + letters.charAt(j), ans, keys);
        }
    }
}
