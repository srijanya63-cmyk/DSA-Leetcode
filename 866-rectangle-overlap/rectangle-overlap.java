class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[2] <= rec2[0] || // left
            rec1[0] >= rec2[2] || // right
            rec1[3] <= rec2[1] || // below
            rec1[1] >= rec2[3]) { // above
            return false;
        }
        return true;
    }
}
