class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> freq = new HashMap<>();
        freq.put(0, 1L); 
        long res = 0;
        int prefix = 0;

        for (int num : nums) {
            if (num % modulo == k) {
                prefix = (prefix + 1) % modulo;
            }
            
            // required previous prefix to satisfy condition
            int need = (prefix - k + modulo) % modulo;
            
            res += freq.getOrDefault(need, 0L);
            
            // store current prefix
            freq.put(prefix, freq.getOrDefault(prefix, 0L) + 1);
        }
        
        return res;
    }
}
