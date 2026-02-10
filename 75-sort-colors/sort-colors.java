class Solution {

    public void sortColors(int[] nums) {

        // start pointer for placing 0s
        int start = 0;

        // mid pointer for current element
        int mid = 0;

        // end pointer for placing 2s
        int end = nums.length - 1;

        // Traverse array until mid crosses end
        while (mid <= end) {

            switch (nums[mid]) {

                case 0:
                    // Swap with start index
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;

                case 1:
                    // Correct position, just move ahead
                    mid++;
                    break;

                case 2:
                    // Swap with end index
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }

    // Function to swap two elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
