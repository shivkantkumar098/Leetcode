class Solution {
      public static int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        char[] arr = tiles.toCharArray();
        backtrack(arr, "", set, used);
        return set.size();
    }

    private static void backtrack(char[] arr, String current, Set<String> set, boolean[] used) {
        if (!current.isEmpty()) set.add(current);

        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            backtrack(arr, current + arr[i], set, used);
            used[i] = false;
        }
    }
}