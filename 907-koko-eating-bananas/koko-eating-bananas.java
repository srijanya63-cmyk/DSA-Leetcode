class Solution {

    // Main function to find minimum eating speed
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;                 // minimum possible speed
        int high = getMax(piles);    // maximum possible speed
        int ans = high;              // store best valid answer

        // Binary search on eating speed
        while (low <= high) {

            int mid = low + (high - low) / 2; // current speed to check

            // Check if Koko can eat all bananas at speed mid
            if (canEat(piles, h, mid)) {
                ans = mid;           // mid is a valid speed
                high = mid - 1;      // try to find smaller speed
            } else {
                low = mid + 1;       // need a higher speed
            }
        }
        return ans;
    }

    // Checks if Koko can finish all piles within h hours at speed k
    private boolean canEat(int[] piles, int h, int k) {

        long hours = 0;  // use long to avoid overflow for large inputs

        for (int pile : piles) {

            // Calculate hours needed for current pile (ceil division)
            hours += ((long) pile + k - 1) / k;

            // If hours exceed h, speed k is not feasible
            if (hours > h) return false;
        }
        return true;
    }

    // Returns the maximum pile size
    private int getMax(int[] piles) {

        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}

// time complexity	O(n log maxPile)
// Space complexity	O(1)