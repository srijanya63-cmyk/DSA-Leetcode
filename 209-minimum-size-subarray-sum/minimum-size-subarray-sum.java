class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // This will store the minimum length of a valid subarray.
        // Initialize with maximum value so any real length will be smaller.
        int minLenWindow = Integer.MAX_VALUE;

        // Stores sum of the current window.
        int currentSum = 0;

        // Two pointers for sliding window
        int low = 0;   // start of window
        int high = 0;  // end of window

        // Expand the window by moving 'high'
        while (high < nums.length) {

            // Add current element to window sum
            currentSum = currentSum + nums[high];

            // Move high pointer forward
            high++;

            // Try shrinking the window while sum is valid
            while (currentSum >= target) {

                // Current window size
                int currentWindowSize = high - low;

                // Update minimum window size
                minLenWindow = Math.min(minLenWindow, currentWindowSize);

                // Remove leftmost element from sum
                currentSum = currentSum - nums[low];

                // Move left pointer forward
                low++;
            }
        }

        // If no valid subarray found, return 0
        // otherwise return minimum length found
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}

            
