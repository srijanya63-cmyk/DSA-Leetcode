class Solution {
    public int maximumGap(int[] nums) {

        if (nums.length < 2) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // step 1: find min & max
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int n = nums.length;

        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];

        // initialize
        for (int i = 0; i < bucketCount; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }

        // step 4: fill buckets
        for (int num : nums) {
            int idx = (num - min) / bucketSize;

            bucketMin[idx] = Math.min(bucketMin[idx], num);
            bucketMax[idx] = Math.max(bucketMax[idx], num);
        }

        // step 5: find max gap
        int maxGap = 0;
        int prev = min;

        for (int i = 0; i < bucketCount; i++) {

            if (bucketMin[i] == Integer.MAX_VALUE) continue;

            maxGap = Math.max(maxGap, bucketMin[i] - prev);
            prev = bucketMax[i];
        }

        return maxGap;
    }
}