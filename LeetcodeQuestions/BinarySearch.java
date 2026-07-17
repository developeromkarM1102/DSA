package LeetcodeQuestions;

public class BinarySearch {

    public int search(int[] nums, int target) {

        int ans = -1;
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {

            // int mid = (s+e)/2;

            // using following mid to avoid constraint overflowing

            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return ans;
    }

    // using Recursion
    public int solve(int[] nums, int target, int s, int e) {

        // base case
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            e = mid - 1;
        } else {
            s = mid + 1;
        }

        return solve(nums, target, s, e);

    }

    public int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        int ans = solve(nums, target, s, e);
        return ans;
    }
}
