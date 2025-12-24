class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;

        for (int pile : piles) {
            // 🔥 FORCE LONG ARITHMETIC
            hours += ((long)pile + k - 1) / k;

            // optimization + overflow safety
            if (hours > h) return false;
        }
        return true;
    }

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