import java.util.Scanner;

public class RotateArrayByK {

    int LeftRotateByK(int arr[], int k){

        k = k % arr.length;
        int temp[] = new int[k];

        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        for(int i=0;i<k;i++){
            arr[arr.length-k+i]=temp[i];
        }

        System.out.println("Array after left rotation by " + k + " is: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        return 0;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        RotateArrayByK obj = new RotateArrayByK();
        obj.LeftRotateByK(arr, k);
    }
}
