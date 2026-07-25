package LeetcodeQuestions;

import java.util.List;

public class Triangle {
    
        static int solve(List<List<Integer>> triangle, int rowIndex, int colIndex){
        
        if(rowIndex == triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }

        //going downward with rowIndex + 1 & colIndex as it is
        int downAns = solve(triangle, rowIndex+1, colIndex);
        //going diagonally with rowIndex + 1 & colIndex + 1 
        int diagonalAns = solve(triangle, rowIndex+1, colIndex+1);

        //calculatiing its min path 
        int finalAns = triangle.get(rowIndex).get(colIndex) + Math.min(downAns,diagonalAns);

        return finalAns;
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        
        int rowIndex = 0;
        int colIndex = 0;
        int ans = solve(triangle, rowIndex, colIndex);
        return ans;
    }
}
