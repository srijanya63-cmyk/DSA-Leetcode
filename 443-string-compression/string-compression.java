class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0; // write pointer
        int i = 0;     // read pointer

        while (i < n) {
            char current = chars[i];
            int count = 0;

            // count occurrences
            while (i < n && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[index++] = current;

            // write count if > 1
            if (count > 1) {
                char[] cnt = String.valueOf(count).toCharArray();
                for (char c : cnt) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
