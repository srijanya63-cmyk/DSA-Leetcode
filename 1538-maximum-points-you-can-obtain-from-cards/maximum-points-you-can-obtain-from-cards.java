class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        int totalSum = 0;
        for (int x : cardPoints)
            totalSum += x;

        // If taking all cards
        if (k == n) return totalSum;

        int windowSize = n - k;
        int windowSum = 0;

        // First window
        for (int i = 0; i < windowSize; i++)
            windowSum += cardPoints[i];

        int minSum = windowSum;

        // Sliding window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];
            minSum = Math.min(minSum, windowSum);
        }

        return totalSum - minSum;
    }
}
