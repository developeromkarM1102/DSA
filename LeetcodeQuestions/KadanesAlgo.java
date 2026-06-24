package LeetcodeQuestions;

public class KadanesAlgo {

    //Kadane's Algorithm || Maximum Subarray Sum
    // Should I:
    // 1. Start a new subarray from nums[i]
    // OR
    // 2. Continue the previous subarray?
    
    public int maxSubArray(int[] nums) {
        int cs = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            maxSum = Math.max(maxSum, cs);
        }
        return maxSum;
    }
}

//Another way of thinking to solve, 
// If current sum becomes negative,throw it away and start fresh. 

class Solution {

    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            
            sum += nums[i];
            maxSum = Math.max(maxSum , sum);

            if(sum<0){
                sum = 0;
            }
        }
        
        return maxSum;
    }
}
