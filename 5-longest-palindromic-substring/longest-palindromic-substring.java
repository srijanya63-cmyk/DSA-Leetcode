class Solution {
    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // odd length palindrome (aba)
            String p1 = check(s, i, i);

            // even length palindrome (abba)
            String p2 = check(s, i, i + 1);

            // jo bada ho usko store karo
            if (p1.length() > ans.length()) ans = p1;
            if (p2.length() > ans.length()) ans = p2;
        }

        return ans;
    }

    public String check(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // palindrome return karo
        return s.substring(left + 1, right);
    }
}