package LeetcodeQuestions;

public class JumpGame {

    static boolean solve(int[] nums, int index) {

        // base case
        if (index == nums.length - 1) {
            return true;
        }
        // if index goes out of bound then
        if (index >= nums.length) {
            return false;
        }
        // invalid case
        if (nums[index] == 0) {
            return false;
        }

        int jumpValue = nums[index];

        boolean overallAns = false;

        for (int jump = 1; jump <= jumpValue; jump++) {
            boolean recAns = solve(nums, index + jump);
            overallAns = overallAns || recAns;
        }
        return overallAns;
    }

    public boolean canJump(int[] nums) {

        int index = 0;
        boolean ans = solve(nums, index);
        return ans;
    }
}
