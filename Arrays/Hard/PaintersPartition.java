package Hard;

public class PaintersPartition {

    static boolean isValidAnswer(int arr[], int k, int mid) {

        int PainterCount = 1;
        int PainterLength = 0;

        for (int i = 0; i < arr.length; i++) {

            if (PainterLength + arr[i] <= mid) {
                PainterLength = PainterLength + arr[i];
            } else {

                PainterCount++;

                if (PainterCount > k || arr[i] > mid) {
                    return false;
                } else {
                    PainterLength = 0;
                    PainterLength += arr[i];
                }
            }
        }
        return true;
    }

    public int minTime(int[] arr, int k) {
        // code here

        if (arr.length < k) {
            return -1;
        }

        int n = arr.length;
        int s = 1;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
