package LeetcodeQuestions;

public class FindPeakElemIn2DMatrix {

    public int[] findPeakGrid(int[][] mat) {

        // length of row
        int m = mat.length;
        // length of column
        int n = mat[0].length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Find the index of the maximum element in the mid column
            int maxRow = 0;

            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            // Check left and right neighbors
            boolean isLeftGreater = (mid > low) && (mat[maxRow][mid - 1] > mat[maxRow][mid]);
            boolean isRightGreater = (mid < high) && (mat[maxRow][mid + 1] > mat[maxRow][mid]);

            // If the element is greater than its neighbors, it is a peak
            if (!isLeftGreater && !isRightGreater) {
                return new int[] { maxRow, mid };
            }
            // Move toward the larger neighbor to find the peak
            else if (isLeftGreater) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }
}
