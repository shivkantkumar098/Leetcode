class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];  // Frequency of characters in p
        int[] sCount = new int[26];  // Frequency of current window in s

        // Initialize frequency count for p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        // Initialize first window
        for (int i = 0; i < k; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            // Add new char
            sCount[s.charAt(i) - 'a']++;
            // Remove old char
            sCount[s.charAt(i - k) - 'a']--;

            // Compare counts
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }
}