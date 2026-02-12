class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        // If k is 1 or less, no valid subarray exists
        if (k <= 1) {
            return 0;
        }

        int n = nums.length;

        int start = 0;     // Left pointer of sliding window
        int end = 0;       // Right pointer of sliding window

        long prod = 1;     // Product of elements inside window
        int count = 0;     // Total valid subarrays count

        // Traverse array using sliding window
        while (end < n) {

            // Include current element in product
            prod = prod * nums[end];

            // Shrink window if product becomes >= k
            while (prod >= k) {
                prod = prod / nums[start];
                start = start + 1;
            }

            // Number of valid subarrays ending at 'end'
            count = count + (end - start + 1);

            // Move right pointer forward
            end = end + 1;
        }

        return count;
    }
}
