package Easy;

import java.util.Arrays;

public class sortArrayOf0sAnd1s {

    public static int[] sortArrayOf0sAnd1s(int arr[]) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0)
                i++;
            if (arr[j] == 1)
                j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 1, 0 };
        int ans[] = sortArrayOf0sAnd1s(arr);
        System.out.print(Arrays.toString(ans));
    }
}
