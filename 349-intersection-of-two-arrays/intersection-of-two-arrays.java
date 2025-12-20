import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Put nums2 elements in set
        for (int n2 : nums2) {
            set.add(n2);
        }

        // Step 2: Check nums1 elements
        for (int n1 : nums1) {
            if (set.contains(n1)) {
                list.add(n1);
                set.remove(n1); // avoid duplicates
            }
        }

        // Step 3: Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
