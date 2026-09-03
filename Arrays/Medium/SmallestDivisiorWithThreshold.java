package Medium;

public class SmallestDivisiorWithThreshold {

    public int smallestDivisor(int[] nums, int threshold) {

        int s = 1;
        int e = nums.length - 1;

        //Calculating maximum possible divisior from an array
        for (int num : nums) {
            e = Math.max(e, num);
        }

        while (s <= e) {
            
            //calculating Mid
            int mid = s + (e - s) / 2;

            int sum = 0;

            // Calculate the sum of ceil(num / mid) for every element
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }
            
            // If sum is within the threshold,
            // mid can be our answer, so try a smaller divisor
            if (sum <= threshold) {
                e = mid - 1;
            } 
            // If sum exceeds the threshold,
            // we need a larger divisor
            else {
                s = mid + 1;
            }

        }
        return s;
    }
}