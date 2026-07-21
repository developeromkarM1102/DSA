package LeetcodeQuestions;

public class CoinChange2{

    public static int solve(int amount, int [] Coins, int index){
        
        //base case
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }
        if(index >= Coins.length){
            return 0;
        }

        ////using include-exclude pattern
        int includeAns = solve(amount-Coins[index], Coins, index);
        int excludeAns = solve(amount, Coins, index+1);
        int finalAns = includeAns + excludeAns;
        return finalAns;
    }

    public static int change(int amount, int [] Coins){
        
        int index = 0;
        int ans = solve(amount , Coins , index);
        return ans;

    }
}