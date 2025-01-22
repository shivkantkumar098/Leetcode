class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; // Perfect numbers are greater than 1
        int sum = 1; // Start with 1 as it is a proper divisor of all numbers

        for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to sqrt(num)
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // Add the corresponding divisor only if it's different
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
