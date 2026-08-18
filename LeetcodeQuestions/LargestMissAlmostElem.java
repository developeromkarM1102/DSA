package LeetcodeQuestions;

public class LargestMissAlmostElem {
    
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        //If there is only 1 subArray
        if (k == n) {

            int max = -1;
            for (int num : nums) {
                max = Math.max(num, max);
            }
            return max;
        }

        //count frequency of every number
        int freq[] = new int[51];

        for (int num : nums) {
            freq[num]++;
        }

        //Every element forms its own subarray
        if (k == 1) {
            int ans = -1;

            for (int num : nums) {
                if (freq[num] == 1) {

                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        int ans = -1;

        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;

    }
}
