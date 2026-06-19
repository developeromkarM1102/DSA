package Basics;

public class countof0sand1s {
    
        public static int[] CountOfZerosAndOnes(int arr[]){
        
        int Zcount = 0;
        int oneCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                Zcount++;
            }
            else
                oneCount++;
        }
        int ans [] = {Zcount,oneCount};
        return ans;
    }
    
    public static void main(String[]args){
        int arr[]={1,1,1,0,0,0,1};
        int ans[]=CountOfZerosAndOnes(arr);
        System.out.println("ZeroCount = " + ans[0]);
        System.out.println("OneCount = " + ans[1]);
    }
}
