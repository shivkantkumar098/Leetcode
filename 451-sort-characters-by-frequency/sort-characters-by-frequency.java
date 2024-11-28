class Solution {
    public String frequencySort(String s) {
        // Convert string to character array
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Sort the characters by frequency using a map
        // Step 1: Build the frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sort the characters based on frequency
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());  // Sort by frequency in descending order

        // Step 3: Build the result string based on frequency
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        // Return the sorted string
        return result.toString();
    
    }
}