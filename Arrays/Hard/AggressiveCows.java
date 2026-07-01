package Hard;

import java.util.Arrays;

public class AggressiveCows {

    // Function to check whether it is possible to place
    // 'k' cows such that the minimum distance between any
    // two cows is at least 'mid'
    static boolean isValidAns(int mid, int k, int stalls[]) {

        // Place the first cow in the first stall
        int cowsCount = 1;

        // Store the index of the last stall where a cow was placed
        int lastPosition = 0;

        // Traverse all remaining stalls
        for (int i = 1; i < stalls.length; i++) {

            // Check if the current stall is at least 'mid'
            // distance away from the last placed cow
            if (stalls[i] - stalls[lastPosition] >= mid) {

                // Place another cow
                cowsCount++;

                // Update the last occupied stall index
                lastPosition = i;

                // If all cows have been placed successfully,
                // then this minimum distance is possible
                if (cowsCount == k) {
                    return true;
                }
            }
        }

        // Could not place all cows
        return false;
    }

    // Function to find the largest minimum distance
    public int aggressiveCows(int[] stalls, int k) {

        // Sort the stall positions because Binary Search
        // on distance requires sorted stall coordinates
        Arrays.sort(stalls);

        int n = stalls.length;

        // Minimum possible answer
        int s = 0;

        // Maximum possible minimum distance
        // (last stall - first stall)
        
        int e = stalls[n - 1] - stalls[0];
        int ans = -1;

        // Binary Search on the answer (minimum distance)
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(mid, k, stalls)) {

                ans = mid;
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }

        // Return the maximum possible minimum distance
        return ans;
    }
}

