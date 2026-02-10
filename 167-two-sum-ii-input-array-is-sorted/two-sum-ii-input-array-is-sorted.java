class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // Pointer starting from the beginning of the array
        int left = 0;

        // Pointer starting from the end of the array
        int right = numbers.length - 1;

        // Continue until the two pointers meet
        while (left < right) {

            // Calculate sum of values at both pointers
            int sum = numbers[left] + numbers[right];

            // If sum matches target, return 1-based indices
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            // If sum is smaller, move left pointer forward to increase sum
            else if (sum < target) {
                left++;
            }
            // If sum is larger, move right pointer backward to decrease sum
            else {
                right--;
            }
        }

        // Return default if no solution is found (usually not needed per problem guarantee)
        return new int[]{-1, -1};
    }
}
