class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);

        // Initialize a StringBuilder to store the complement
        StringBuilder complement = new StringBuilder();

        // Iterate over each character in the binary string
        for (char bit : binaryString.toCharArray()) {
            // Flip the bits: '0' -> '1' and '1' -> '0'
            complement.append(bit == '0' ? '1' : '0');
        }

        // Convert the complement binary string back to an integer
        return Integer.parseInt(complement.toString(), 2);
    }
}