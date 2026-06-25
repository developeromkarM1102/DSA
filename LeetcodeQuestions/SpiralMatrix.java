package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        // List to store the spiral order elements
        List<Integer> result = new ArrayList<>();

        // Number of rows and columns
        int n = matrix.length;
        int m = matrix[0].length;

        // Four boundaries of the current layer
        int startingRow = 0;
        int endingRow = n - 1;
        int startingcol = 0;
        int endingcol = m - 1;

        // Continue until all layers are traversed
        while (startingRow <= endingRow && startingcol <= endingcol) {

            // Step 1: Traverse Left → Right on the top row
            for (int col = startingcol; col <= endingcol; col++) {
                result.add(matrix[startingRow][col]);
            }

            // Top row is completed, move it down
            startingRow++;

            // Step 2: Traverse Top → Bottom on the right column
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingcol]);
            }

            // Right column is completed, move it left
            endingcol--;

            // Step 3: Traverse Right → Left on the bottom row
            // Check because the top boundary may have crossed the bottom
            if (startingRow <= endingRow) {
                for (int col = endingcol; col >= startingcol; col--) {
                    result.add(matrix[endingRow][col]);
                }
            }

            // Bottom row is completed, move it up
            endingRow--;

            // Step 4: Traverse Bottom → Top on the left column
            // Check because the left boundary may have crossed the right
            if (startingcol <= endingcol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingcol]);
                }
            }

            // Left column is completed, move it right
            startingcol++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }

}


