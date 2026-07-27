package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    static void solve(int[] candidates, int target, int index, List<Integer> output, List<List<Integer>> ans) {

        // base case
        if (target == 0) {
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
        solve(candidates, target - candidates[index], index + 1, output, ans);
        // backtracking step -> bcz duplicate are not allowed
        output.remove(output.size() - 1);
        // to gain an unique combo
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        // exclude call
        solve(candidates, target, index + 1, output, ans);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(candidates, target, index, output, ans);
        return ans;
    }

}