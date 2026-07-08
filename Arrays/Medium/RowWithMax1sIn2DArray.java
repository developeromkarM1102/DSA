package Medium;

public class RowWithMax1sIn2DArray {

    // Finds the index of the first occurrence of 1 in a given row
    static int getFirstOccIndex(int[][] arr, int rowIndex) {

        int totalRow = arr.length;
        int totalCol = arr[0].length;

        // If the last element is 0, then the entire row contains only 0s
        if (arr[rowIndex][totalCol - 1] == 0) {
            return totalCol;
        } else {

            // Binary Search to find the first occurrence of 1
            int s = 0;
            int e = totalCol - 1;
            int ans = -1;

            while (s <= e) {

                // Calculate middle index
                int mid = s + (e - s) / 2;

                if (arr[rowIndex][mid] == 0) {
                    // First 1 must be on the right side
                    s = mid + 1;
                } else {
                    // Store current index and search on the left
                    ans = mid;
                    e = mid - 1;
                }
            }

            // Return index of first 1
            return ans;
        }
    }

    public int rowWithMax1s(int[][] arr) {

        int totalRow = arr.length;
        int totalCol = arr[0].length;

        // Stores maximum number of 1s found so far
        int max = -1;

        // Stores the index of the row having maximum 1s
        int maxRowIndex = -1;

        // Stores the first occurrence index of 1 for each row
        int firstOccIndex = -1;

        // Traverse every row
        for (int row = 0; row < totalRow; row++) {

            // Find first occurrence of 1 in the current row
            firstOccIndex = getFirstOccIndex(arr, row);

            // Number of 1s = Total Columns - First Occurrence Index
            int oneCount = totalCol - firstOccIndex;

            // Update answer if current row has more 1s
            if (oneCount != 0 && oneCount > max) {
                max = oneCount;
                maxRowIndex = row;
            }
        }

        // Return row index with maximum number of 1s
        // Returns -1 if no row contains any 1
        return maxRowIndex;
    }
}
