package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    //Brute Force Soln for 3Sum
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        int target = 0;
        Set<List<Integer>> output = new HashSet<>();

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                       List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        output.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(output);
    }
}