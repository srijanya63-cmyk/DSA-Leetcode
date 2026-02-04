import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;                 // length of array
        int[] result = new int[n];           // result array
        Stack<Integer> st = new Stack<>();   // stack stores indices

        // Traverse array twice for circular behavior
        for (int i = 2 * n - 1; i >= 0; i--) {

            int idx = i % n;  // convert index to circular range

            // Remove smaller or equal elements
            while (!st.isEmpty() && nums[st.peek()] <= nums[idx]) {
                st.pop();
            }

            // Fill answer only in first pass
            if (i < n) {
                result[idx] = st.isEmpty() ? -1 : nums[st.peek()];
            }

            // Push current index
            st.push(idx);
        }

        return result;   // return final result
    }
}
