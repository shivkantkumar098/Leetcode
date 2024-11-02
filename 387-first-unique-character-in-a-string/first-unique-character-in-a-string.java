class Solution {
    public int firstUniqChar(String s) {
      // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        //  Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCountMap.get(s.charAt(i)) == 1) {
                return i; // Return the index of the first unique character
            }
        }

        // Return -1 if no unique character is found
        return -1;
    }
}