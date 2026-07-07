package LeetcodeQuestions;

public class SearchIn2DMatrix {

        //only when The first integer of each row is greater than the last integer of the previous row.
        public boolean searchMatrix(int[][] matrix, int target) {
        
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        //counting the size of 2D Array
        int n = totalRow * totalCol;

        int s = 0;
        int e = n-1;

        while(s<=e){

            int mid = s + (e-s)/2;

            //finding the row index of target
            int RowIndex = mid / totalCol;
            //finding the col index of target 
            int ColIndex = mid % totalCol;

            if(matrix[RowIndex][ColIndex]==target){
                return true;
            }
            else if(matrix[RowIndex][ColIndex]>target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return false;
    }
}
