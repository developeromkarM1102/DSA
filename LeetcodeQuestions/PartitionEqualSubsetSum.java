package LeetcodeQuestions;

public class PartitionEqualSubsetSum {

    static boolean solve(int target, int nums[], int index) {

        // base case
        if (target == 0) {
            return true;
        }
        // Target can't be negative
        if (target < 0) {
            return false;
        }
        // if array is out of bound
        if (index >= nums.length) {
            return false;
        }

        // using include-exclude pattern
        boolean includeAns = solve(target - nums[index], nums, index + 1);
        boolean excludeAns = solve(target, nums, index + 1);

        // return true if atleast one is true else false
        return includeAns || excludeAns;
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;

        // finding sum of all element
        for (int num : nums) {
            sum += num;
        }

        // initialize index
        int index = 0;

        // calculating target to compare subset
        int target = sum / 2;

        // if sum is odd
        if ((sum & 1) == 1) {
            return false;
        }

        boolean ans = solve(target, nums, index);
        return ans;
    }
}