package LeetcodeQuestions;

public class MinDaysToMakeBouquet {

    private boolean canMakeBouquets( int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int consecutive = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                consecutive++;

                // We have k adjacent flowers
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;

                    if (bouquets >= m) {
                        return true;
                    }
                }

            } else {
                // Adjacency is broken
                consecutive = 0;
            }
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        // Total flowers required
        long required = (long) m * k;

        // Not enough flowers
        if (required > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}