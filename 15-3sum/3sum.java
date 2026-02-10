import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        // If array is null or has less than 3 elements, no triplet possible
        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        // Sort array to use two-pointer technique
        Arrays.sort(nums);

        // HashSet to automatically remove duplicate triplets
        Set<List<Integer>> result = new HashSet<>();

        // Fix the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {

            // Two pointers for remaining two elements
            int left = i + 1;
            int right = nums.length - 1;

            // Move pointers toward each other
            while (left < right) {

                // Calculate sum of three numbers
                int sum = nums[i] + nums[left] + nums[right];

                // If sum is zero, valid triplet found
                if (sum == 0) {

                    // Add triplet to set (duplicates auto removed)
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers to search next pair
                    left++;
                    right--;
                }
                // If sum is smaller, move left pointer to increase sum
                else if (sum < 0)
                    left++;
                // If sum is larger, move right pointer to decrease sum
                else
                    right--;
            }
        }

        // Convert Set to List and return result
        return new ArrayList<>(result);
    }
}

    