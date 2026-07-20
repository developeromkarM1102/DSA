package LeetcodeQuestions;

public class HouseRobber {
    
    static int solve(int nums[], int index) {

        if (index >= nums.length) {
            return 0;
        }

        int includeAns = nums[index] + solve(nums, index + 2);
        int excludeAns = 0 + solve(nums, index + 1);
        int finalAns = Math.max(includeAns, excludeAns);
        return finalAns;
    }

    public int rob(int[] nums) {

        int index = 0;

        int ans = solve(nums, index);
        return ans;

    }
}
