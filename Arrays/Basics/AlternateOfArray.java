package Basics;

public class AlternateOfArray {

    // Print Alternate Elements from Start and End
    public static void AltArr(int arr[]) {

        // Step 1: Get the size of the array
        int n = arr.length;

        // Step 2: Initialize two pointers
        // i -> points to the start
        // j -> points to the end
        int i = 0;
        int j = n - 1;

        // Step 3: Traverse until both pointers meet or cross
        while (i <= j) {

            // Step 4: If only one element remains,
            // print it and terminate the function
            if (i == j) {
                System.out.print(arr[i]);
                return;
            }

            // Step 5: Print element from the start
            System.out.print(arr[i]);
            i++;

            // Step 6: Print element from the end
            System.out.print(arr[j]);
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        AltArr(arr);
    }
}
