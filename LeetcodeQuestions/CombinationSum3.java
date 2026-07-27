package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    static void solve(int[] candidates, int target, int index, List<Integer> output, List<List<Integer>> ans, int count,
            int k) {

        // base case
        if (count == k && target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }
        // if index goes out of bound
        if (index >= candidates.length) {
            return;
        }
        // if target is negative
        if (target < 0) {
            return;
        }
        // Recursive call
        output.add(candidates[index]);
        // using include-exclude pattern
        // include call
        solve(candidates, target - candidates[index], index + 1, output, ans, count + 1, k);
        // backtracking step -> bcz duplicate are not allowed
        output.remove(output.size() - 1);
        // to gain an unique combo
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        // exclude call
        solve(candidates, target, index + 1, output, ans, count, k);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        //
        int target = n;
        //
        int[] candidates = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int count = 0;
        solve(candidates, target, index, output, ans, count, k);
        return ans;
    }
}
