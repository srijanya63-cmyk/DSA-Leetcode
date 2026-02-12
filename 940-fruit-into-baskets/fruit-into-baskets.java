class Solution {
    public int totalFruit(int[] fruits) {

        // Map to store fruit type as key and its count in the current window as value
        Map<Integer, Integer> basket = new HashMap<>();

        // Left pointer of sliding window
        int left = 0;

        // Right pointer of sliding window
        int right = 0;

        // Variable to store maximum number of fruits collected
        int maxFruits = 0;

        // Move the right pointer to expand the window
        for (right = 0; right < fruits.length; right++) {

            // Add current fruit to the basket (increase its count)
            int currentCount = basket.getOrDefault(fruits[right], 0);
            basket.put(fruits[right], currentCount + 1);

            // If more than 2 fruit types are in basket, shrink window
            while (basket.size() > 2) {

                // Count of fruit at the left pointer
                int fruitCount = basket.get(fruits[left]);

                // If only one left, remove it completely
                if (fruitCount == 1) {
                    basket.remove(fruits[left]);
                } 
                // Otherwise, decrease its count
                else {
                    basket.put(fruits[left], fruitCount - 1);
                }

                // Move left pointer forward to shrink window
                left++;
            }

            // Update maximum window size (maximum fruits collected)
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        // Return the maximum fruits collected
        return maxFruits;
    }
}





        
