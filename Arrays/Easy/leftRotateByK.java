package Easy;
import java.util.Scanner;

public class leftRotateByK {
    public static void main(String[] args) {
        // Code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int arr [] = new int [n];


        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();   
        }

        for(int j=1;j<=k;j++){

        int temp = arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }
}
