package Easy;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

    public static List<Integer> FindMissingElement (int [] arr){

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;

        //marking the position with -
        for(int index=0;index<n;index++){

            int value = Math.abs(arr[index]);

            int position = value - 1;

            if(arr[position]>0){
                arr[position] = -arr[position];
            }
        }

        //finding the number
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,3,5,6};
        List<Integer> ans = FindMissingElement(arr);
        System.out.println(ans);
    }
}