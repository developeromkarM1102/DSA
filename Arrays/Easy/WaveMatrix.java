package Easy;

import java.util.ArrayList;
import java.util.List;

public class WaveMatrix {
    
    public static List<Integer> waveMatrix(int arr[][]){

        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        for(int col=0;col<m;col++){
            
            if((col & 1) == 1 ){
                for(int row=n-1;row>=0;row--){
                    result.add(arr[row][col]);
                }
            }
            else{
                for(int row=0;row<n;row++){
                    result.add(arr[row][col]);
                }
            }
           
        }

        return result;
    }

    public static void main(String[] args) {
        int arr [][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        List<Integer> ans = waveMatrix(arr);
        System.out.println(ans);
    }
}
