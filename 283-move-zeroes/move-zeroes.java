class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // position for next non-zero

        // move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // fill remaining with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
