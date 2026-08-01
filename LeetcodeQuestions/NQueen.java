package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

    // Function to check whether a queen can be placed safely
    static boolean isSafeToPlace(int rowIndex, int colIndex, int n, char[][] board) {

        int row = rowIndex;
        int col = colIndex;

        // Check left side of the same row
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        // Check upper-left diagonal
        row = rowIndex;
        col = colIndex;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        // Check lower-left diagonal
        row = rowIndex;
        col = colIndex;

        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }

        // No queen found in any direction
        return true;
    }

    // Backtracking function
    static void solve(char[][] board, int n, int colIndex, List<List<String>> ans) {

        // Base Case
        // If all columns are filled,
        // one valid solution is found.
        if (colIndex == n) {

            List<String> temp = new ArrayList<>();

            // Convert char[][] into List<String>
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        // Try placing a queen in every row of the current column

        for (int rowIndex = 0; rowIndex < n; rowIndex++) {

            // Check if placing queen is safe
            if (isSafeToPlace(rowIndex, colIndex, n, board)) {

                // Place the queen
                board[rowIndex][colIndex] = 'Q';

                // Move to next column
                solve(board, n, colIndex + 1, ans);

                // Backtracking
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        // Create chessboard
        char[][] board = new char[n][n];

        // Initially every cell is empty
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        // Start placing queens from first column
        solve(board, n, 0, ans);

        return ans;
    } 
}