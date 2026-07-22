package LeetcodeQuestions;

public class CoinChange1 {

    static int solve(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        // Store the minimum number of coins required
        int mini = Integer.MAX_VALUE;

        for (int coin : coins) {

            // Solving using all possible combinations
            int recursionAns = solve(coins, amount - coin);
            // valid case -> recursionAns != Integer.MAX_VALUE
            if (recursionAns != Integer.MAX_VALUE) {
                int totalCoinsUsed = recursionAns + 1;
                mini = Math.min(mini, totalCoinsUsed);
            }
        }
        return mini;
    }

    public int coinChange(int[] coins, int amount) {

        int ans = solve(coins, amount);
        // checking invalid case
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
}