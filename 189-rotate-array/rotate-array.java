class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // If k is greater than array length, reduce it
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse elements between two indices
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            // Swap elements at left and right indices
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move pointers towards center
            left++;
            right--;
        }
    }
}
