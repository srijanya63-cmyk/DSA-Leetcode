class Solution {
    // Defines the Solution class

    public boolean searchMatrix(int[][] matrix, int target) {
        // Function to check if target exists in the matrix

        int m = matrix.length;
        // Number of rows in the matrix

        int n = matrix[0].length;
        // Number of columns in the matrix

        int low = 0;
        // Starting index for binary search (flattened matrix)

        int high = m * n - 1;
        // Ending index for binary search

        while (low <= high) {
        // Standard binary search loop

            int mid = low + (high - low) / 2;
            // Calculate middle index safely

            int row = mid / n;
            // Convert 1D index to row index

            int col = mid % n;
            // Convert 1D index to column index

            int value = matrix[row][col];
            // Get the matrix value at calculated row and column

            if (value == target) {
                return true;
            }
            // If target is found, return true

            else if (value < target) {
                low = mid + 1;
            }
            // If value is smaller than target, search right half

            else {
                high = mid - 1;
            }
            // If value is greater than target, search left half
        }

        return false;
        // Target not found in matrix
    }
}

        // Time Complexity: O(log(m × n))

//Space Complexity: O(1)