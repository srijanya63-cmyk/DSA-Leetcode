class Solution {
    public boolean rotateString(String s, String goal) {
        
        // Step 1: length check
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: concatenate
        String doubled = s + s;

        // Step 3: check substring
        return doubled.contains(goal);
    }
}