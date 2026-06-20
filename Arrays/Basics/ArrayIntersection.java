package Basics;

import java.util.Arrays;

public class ArrayIntersection {
        public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int arr2[] = {20,50,60,30};
        int ans [] = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j])
                {
                    ans[i] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
