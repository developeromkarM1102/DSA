package Easy;

import java.util.ArrayList;
import java.util.List;

public class colSumOf2DArray {
    
    public static List<Integer> colsumof2DArray(int arr [][]){

        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        for(int col=0;col<m;col++){
            int sum = 0;
            for(int row=0;row<n;row++){
                int value = arr[row][col];
                sum += value;
            }
            result.add(sum);
        }

        return result;
        
    }

    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6}};
        List<Integer> ans = colsumof2DArray(arr);
        System.out.println(ans);
    }
}
