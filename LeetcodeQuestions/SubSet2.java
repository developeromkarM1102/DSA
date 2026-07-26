
package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet2 {

    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {

        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currentValue = nums[index];

        // rescursion using include- exclude pattern
        // include call
        output.add(currentValue);
        solve(nums, index + 1, output, ans);
        
        // backtraking step -> for return null value while coming back
        output.remove(output.size() - 1);

        // while excluding , ignore the same element and move towards the new element
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        // exclude call
        solve(nums, index + 1, output, ans);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // bcz array is sorted
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, index, output, ans);
        return ans;
    }
}


