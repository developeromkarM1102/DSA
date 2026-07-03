package Hard;

public class EkoSpoj {

    static boolean isValidAns(int arr[], int m, int MaxHeight) {

        //intializing totalwood = 0 
        long totalWoodCollected = 0;

        for (int i = 0; i < arr.length; i++) {
            //checking for currentwoodcollection and adding to total
            if (arr[i] > MaxHeight) {
                long currentWoodCollected = arr[i] - MaxHeight;
                totalWoodCollected += currentWoodCollected;
            }
        }
        //if totalwood >= than range return true else false
        if (totalWoodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    int maxHeight(int[] arr, int m) {
        // code here
        int n = arr.length;
        //start 
        int s = 0;
        int maxi = -1;
        //checking for an max 
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        //assining max to last range
        int e = maxi;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            //if ans is valid storing it and moving to next possible solution
            if (isValidAns(arr, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

}