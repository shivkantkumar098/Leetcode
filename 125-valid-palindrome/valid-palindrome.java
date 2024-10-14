class Solution {
    public boolean isPalindrome(String s) {
        // Initialize an empty StringBuilder to store the processed characters
        StringBuilder pre = new StringBuilder();
        
        // Loop through the string and filter out non-alphanumeric characters
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                pre.append(Character.toLowerCase(c));
            }
        }
        
        // Convert the StringBuilder to a string
        String processed = pre.toString();
        
        // Initialize two pointers
        int l = 0;
        int r = processed.length() - 1;
        
        // Check if the string is a palindrome
        while (l < r) {
            if (processed.charAt(l) != processed.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        
        return true;
    }
}
