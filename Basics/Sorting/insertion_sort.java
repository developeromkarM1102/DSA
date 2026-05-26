package Sorting;
import java.util.Scanner;

public class insertion_sort {

    public static void insertionSort(int arr[] , int n){
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
    }
}
