class Solution {
    public int longestOnes(int[] nums, int k) {
        // Left pointer of sliding window
        int left = 0;

        // Count of zeros in current window
        int zeroCount = 0;

        // Stores maximum valid window length
        int maxLen = 0;

        // Right pointer expands the window
        for (int right = 0; right < nums.length; right++) {

            // If current element is 0, increase zero count
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If zeros exceed k, shrink window from left
            while (zeroCount > k) {
                // Reduce zero count if left element is zero
                if (nums[left] == 0) {
                    zeroCount--;
                }
                // Move left pointer forward
                left++;
            }

            // Update maximum window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // Return maximum length found
        return maxLen;
    }
}
