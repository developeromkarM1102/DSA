import java.util.Scanner;

public class RotateArrayByK {

    void RightRotateByK(int arr[], int k){

        k = k % arr.length;
        int temp[] = new int[k];

        // Step 1: Store last k elements
        for(int i=0;i<k;i++){
            temp[i] = arr[arr.length - k + i];
        }

        // Step 2: Shift remaining elements to right
        for(int i = arr.length - k - 1; i >= 0; i--){
            arr[i + k] = arr[i];
        }

        // Step 3: Put temp elements at start
        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }

        System.out.println("Array after right rotation by " + k + " is: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
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
        obj.RightRotateByK(arr, k);
    }
}
