import java.util.Scanner;

public class smallest_of_negative {
    public static void main(String[] args) {
        //Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int Min = arr[0];
        int MinIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min=arr[i];
                MinIndex = i;
            }
        }

        System.out.println("Min element = " + Min + " found at index " + MinIndex);
    }
}
