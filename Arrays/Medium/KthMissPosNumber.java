package Medium;

public class KthMissPosNumber {

    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Number of missing positive integers
            // before arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                // Need more missing numbers
                low = mid + 1;
            } else {
                // This could be our answer,
                // so search on the left
                high = mid - 1;
            }
        }

        // low = number of array elements
        // that are before the kth missing number
        return low + k;
    }
}
