package LeetcodeQuestions;

public class SudokuSolver {

    static boolean isSafeToPlace(char[][] board, char charValue, int rowIndex, int colIndex) {
        
        //rules:

        //check for horizontal or same row
        //rowIndex are same for all cell
        //and for col value changed from 0 to < 9
        for (int col = 0; col < 9; col++) {
            if (board[rowIndex][col] == charValue) {
                return false;
            }
        }

        //check for vertical or same col
        //colIndex is same for sub cell
        //rowIndex is chaned from 0 to < 9
        for (int row = 0; row < 9; row++) {
            if (board[row][colIndex] == charValue) {
                return false;
            }
        }

        //check for current 3*3 SUBBOX
        //starting row = row - row % 3
        //starting col = col - col % 3

        int startRow = rowIndex - rowIndex % 3;
        int startCol = colIndex - colIndex % 3;

        //travel over that 3*3 subBox
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if (board[actualRow][actualCol] == charValue) {
                    return false;
                }
            }
        }

        //if all the above cases are false then 
        return true; //because now its safe to place

    }

    static boolean findEmptyCell(char[][] board, int[] emptyCell) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    //store empty cell row
                    emptyCell[0] = i;
                    //store empty cell col index
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solveSudokuHelper(char[][] board) {
        int[] emptyCell = new int[2];
        if (!findEmptyCell(board, emptyCell)) {
            return true;
        }

        //if lets say i foung a empty cell
        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for (int value = 1; value <= 9; value++) {
            char charValue = (char) (value + '0');
            if (isSafeToPlace(board, charValue, rowIndex, colIndex)) {
                //Then Place
                board[rowIndex][colIndex] = charValue;

                //recursion call
                if (solveSudokuHelper(board) == true) {
                    return true;
                }
                //backtracking if ans is not valid
                board[rowIndex][colIndex] = '.';
            }
        }

        //if question is not solve then
        return false;
    }

    public void solveSudoku(char[][] board) {

        solveSudokuHelper(board);

    }
}
