package Easy;

import java.util.ArrayList;
import java.util.List;

public class sumOf2DArray {
    
    public static List<Integer> findSumOf2dArray(int arr[][]){

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for(int row=0;row<m;row++){
            int sum = 0;
            for(int col=0;col<n;col++){
                int value = arr[row][col];
                sum += value;
            }

            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr [][] ={{1,2,3,4},{4,3,2,1}};
        List<Integer> ans = findSumOf2dArray(arr);
        System.out.println(ans);
    }
}
