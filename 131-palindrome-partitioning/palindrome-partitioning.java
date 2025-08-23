class Solution {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        helper(s, 0, new ArrayList<>());
        return ans;
    }

    void helper(String s, int index, List<String> path) {
        int n = s.length();
        // Base case: if we reached the end, add current path
        if (index == n) {
            ans.add(new ArrayList<>(path));
            return;
        }

        // Try all possible cuts starting at index
        for (int end = index; end < n; end++) {
            String sub = s.substring(index, end + 1);

            // Inclusion step → only if palindrome
            if (isPalindrome(sub)) {
                path.add(sub); // choose
                helper(s, end + 1, path);
                path.remove(path.size() - 1); // exclusion (backtrack)
            }
        }
    }
    boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
