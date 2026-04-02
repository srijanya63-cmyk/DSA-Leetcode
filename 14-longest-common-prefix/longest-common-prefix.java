class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();   // fixed typo
        char[] last = strs[strs.length - 1].toCharArray(); // fixed typo

        StringBuilder result = new StringBuilder(); // added declaration

        for (int i = 0; i < first.length; i++) {
            if (i >= last.length || first[i] != last[i]) // added bound check
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}