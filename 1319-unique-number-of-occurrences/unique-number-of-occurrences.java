import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Check uniqueness of frequencies
        HashSet<Integer> set = new HashSet<>();
        
        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false; // duplicate frequency found
            }
            set.add(freq);
        }
        
        return true;
    }
}