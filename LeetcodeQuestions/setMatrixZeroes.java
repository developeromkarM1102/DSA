package LeetcodeQuestions;

public class setMatrixZeroes {
    
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        
        int rows[] = new int [n];
        int cols[] = new int [m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}

/* 

    Optimal solution

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1;

        // Mark rows and columns
        for (int i = 0; i < n; i++) {

            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Fill zeroes using markers
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
} 
*/
