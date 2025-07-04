import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int cnt = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // lightest person is paired
            }
            j--; // heaviest person always takes the boat
            cnt++; // one boat used
        }

        return cnt;
    }
}
