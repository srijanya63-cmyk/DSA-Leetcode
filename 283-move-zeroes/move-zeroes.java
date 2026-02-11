class Solution {
    
        public void moveZeroes(int[] nums) {
    // Start with the first position
    int insertPosition = 0;

    // Fill all non-zero numbers
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[insertPosition] = nums[i];
            insertPosition++;
        }
    }

    // Fill remaining positions with zero
    while (insertPosition < nums.length) {
        nums[insertPosition++] = 0;
    }
}
}