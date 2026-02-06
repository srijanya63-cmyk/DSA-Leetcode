import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        // Find maximum candies
        for (int c : candies) {
            max = Math.max(max, c);
        }

        List<Boolean> result = new ArrayList<>();

        // Check each kid
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }

        return result;
    }
}
