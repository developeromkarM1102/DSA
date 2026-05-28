public class ReverseanArray {
    void ReverseArray(int arr[],int sz){
        int start = 0; int end = sz-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
      public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sz=5;

        ReverseanArray ob=new ReverseanArray();
        ob.ReverseArray(arr, sz);

       
    }
}

/*
    Another method is start from the end of the array and print the elements until the start of the array is reached.

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr [] = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();   
        }

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}

*/
