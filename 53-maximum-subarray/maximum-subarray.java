class Solution {
    public int maxSubArray(int[] nums) {

        // maxSum will store the maximum subarray sum found so far
        // Initialize it with the first element of the array
        int maxSum = nums[0];

        // currSum will store the maximum sum of subarray
        // ending at the current index
        int currSum = nums[0];

        // Start iterating from the second element
        for (int i = 1; i < nums.length; i++) {

            // At each index, we have two choices:
            // 1. Start a new subarray from nums[i]
            // 2. Extend the previous subarray by adding nums[i]
            // We choose the option which gives maximum sum
            currSum = Math.max(nums[i], currSum + nums[i]);

            // Update maxSum if the current subarray sum is greater
            maxSum = Math.max(maxSum, currSum);
        }

        // Return the maximum subarray sum found
        return maxSum;
    }
}
// TC O(n)
// SC O(1)