class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // ✅ This loop must be inside the method
        for (int num : count) {
            if (num != 0) return false;
        }

        // ✅ Also inside method
        return true;
    }
}