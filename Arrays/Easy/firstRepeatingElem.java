package Easy;

import java.util.HashMap;

public class firstRepeatingElem {
    
    public static int firstrepeatingelem(int [] arr){

        HashMap <Integer,Integer> freq = new HashMap<>();
    
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num, 0)+1);
        }
    
        for(int i : arr){
            if(freq.get(i)>1){
                return i;
            }
        }
    
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {10,5,3,5,6,6};
        int ans = firstrepeatingelem(arr);
        System.out.println(ans);
    }

}
