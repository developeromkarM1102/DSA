package LeetcodeQuestions;

public class ClimbingStairs {

    //This soln is giving TLE but it will avoid using DP will be done later. 
    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int ans = climbStairs(n - 1) + climbStairs(n - 2);
        return ans;
    }
}
