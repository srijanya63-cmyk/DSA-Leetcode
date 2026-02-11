class Solution {
    public int maxArea(int[] height) {
        // Pointer at the beginning of the array
        int left = 0;
        
        // Pointer at the end of the array
        int right = height.length - 1;
        
        // Variable to store the maximum water area found
        int maxWater = 0;

        // Continue until both pointers meet
        while (left < right) {
            
            // Height of container is limited by the shorter line
            int h = Math.min(height[left], height[right]);
            
            // Width between the two lines
            int width = right - left;
            
            // Area formed between the two lines
            int area = h * width;

            // Update maximum area if current is larger
            maxWater = Math.max(maxWater, area);

            // Move the pointer with smaller height inward
            // because moving the taller one cannot increase area
            if (height[left] < height[right]) {
                left++;   // move left pointer right
            } else {
                right--;  // move right pointer left
            }
        }

        // Return maximum water stored
        return maxWater;
    }
}
