class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Stores sum of current window
        long windowSum = 0;

        // Step 1: Compute sum of first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum with first window sum
        long maxSum = windowSum;

        // Step 2: Slide the window across array
        for (int i = k; i < nums.length; i++) {
            // Add next element and remove outgoing element
            windowSum += nums[i] - nums[i - k];

            // Update maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return maximum average
        return (double) maxSum / k;
    }
}
