class Solution {
    public String makeFancyString(String s) {
       StringBuilder result = new StringBuilder();
        char[] charArray = s.toCharArray();
        
        // Initialize a counter for consecutive characters
        int count = 1; 

        // Loop through the characters in the char array
        for (int i = 0; i < charArray.length; i++) {
            // If it's not the first character and matches the previous one, increase the count
            if (i > 0 && charArray[i] == charArray[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count for a new character
            }

            // If the count is less than or equal to 2, append the character to result
            if (count <= 2) {
                result.append(charArray[i]);
            }
        }
        
        return result.toString(); // Return the final result as a string
    }
}