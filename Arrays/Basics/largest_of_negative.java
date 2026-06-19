package Basics;
import java.util.Scanner;

public class largest_of_negative {
    public static void main(String[] args) {
        //Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int Max = arr[0];
        int MaxIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
                MaxIndex = i;
            }
        }

        System.out.println("Max element = " + Max + " found at index " + MaxIndex);
    }
}
