package LeetcodeQuestions;

public class MinimizeDiffBetnTargetElemAndChoosenElem {

    static int solve(int sum, int[][] mat, int target, int row) {

        // Invalid Case
        if (row >= mat.length) {
            return Math.abs(target - sum);
        }

        // assigning MIN value
        int mini = Integer.MAX_VALUE;

        // checking for all combinations
        for (int num : mat[row]) {
            int ans = solve(sum + num, mat, target, row + 1);
            // checking most min value and returning
            mini = Math.min(mini, ans);
        }
        return mini;
    }

    public int minimizeTheDifference(int[][] mat, int target) {

        int row = 0;
        int sum = 0;

        int ans = solve(sum, mat, target, row);
        return ans;
    }
}