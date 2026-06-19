package Basics;

public class unsortedElem {

    public static int UnsortedElem(int arr[]) {
        int unsorted = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
            } else
                unsorted = arr[i + 1];
        }
        return unsorted;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 50, 40 };
        int ans = UnsortedElem(arr);
        System.out.println(ans);
    }
}
