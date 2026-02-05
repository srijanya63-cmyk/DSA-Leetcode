class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absentCount++;
                if (absentCount >= 2)
                    return false;
                lateCount = 0;
            } 
            else if (c == 'L') {
                lateCount++;
                if (lateCount >= 3)
                    return false;
            } 
            else {
                lateCount = 0;
            }
        }

        return true;
    }
}
