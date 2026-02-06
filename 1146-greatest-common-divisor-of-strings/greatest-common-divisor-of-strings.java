class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if both strings share the same pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of lengths
        int gcdLen = gcd(str1.length(), str2.length());

        // Return prefix of gcd length
        return str1.substring(0, gcdLen);
    }

    // Helper function to compute GCD
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
