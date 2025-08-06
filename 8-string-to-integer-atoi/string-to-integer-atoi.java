class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int i = 0;
        int sign = 1;

        // Step 1: Remove leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
