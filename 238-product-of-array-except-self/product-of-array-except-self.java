class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Array to store product of elements to the LEFT of each index
        int left[] = new int[n];

        // Array to store product of elements to the RIGHT of each index
        int right[] = new int[n];

        // Final answer array
        int ans[] = new int[n];

        // No elements on the left of index 0
        left[0] = 1;

        // Fill left array
        // left[i] = product of all elements before i
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // No elements on the right of last index
        right[n - 1] = 1;

        // Fill right array
        // right[i] = product of all elements after i
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Final result: multiply left and right products
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        // Return result
        return ans;
    }
}

