class Solution {
    public String largestOddNumber(String num) {
        
        // Start checking from the last digit (rightmost side)
        for (int i = num.length() - 1; i >= 0; i--) {
            
            // Convert character to integer
            int digit = num.charAt(i) - '0';
            
            // Check if the digit is odd
            if (digit % 2 == 1) {
                
                // If odd, return substring from index 0 to i (inclusive)
                // This ensures the largest possible number
                return num.substring(0, i + 1);
            }
        }
        
        // If no odd digit is found, return empty string
        return "";
    }
}