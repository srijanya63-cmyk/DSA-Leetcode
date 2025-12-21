class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        // Special case: only one element
        if (n == 1) {
            return 1;
        }

        int minIndex = 0;
        int maxIndex = 0;

        // Find index of minimum and maximum elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Ensure left is smaller index and right is larger index
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        // Option 1: Remove both from the front
        int removeFromFront = right + 1;

        // Option 2: Remove both from the back
        int removeFromBack = n - left;

        // Option 3: Remove one from front and one from back
        int removeFromBoth = (left + 1) + (n - right);

        // Return minimum deletions among all options
        return Math.min(removeFromFront, 
               Math.min(removeFromBack, removeFromBoth));
    }
}
// time complexity O(n)
// space complexity O(1)