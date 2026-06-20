package Basics;

public class RightRotateByOne {

    // shift BY 1
    // Brute force approach
    public static void ShiftBy1(int arr[]) {

        int n = arr.length;

        // Step 1 : Copy the last elem in temp variable
        int temp = arr[n - 1];

        // Step 2 : Traverse the elem from end to start
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3 : copy the temp variable at O'th Index
        arr[0] = temp;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        ShiftBy1(arr);
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
