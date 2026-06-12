package LeetcodeQuestions;

public class nextPermutations {

    public void nextPermutation(int[] nums) {
        //Optimal solution 
        int n = nums.length;

        int ind = -1;

        // Step 1: Find breakpoint
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // If no breakpoint exists
        if(ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find next greater element
        for(int i = n - 1; i > ind; i--) {
            if(nums[i] > nums[ind]) {

                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;

                break;
            }
        }

        // Step 3: Reverse remaining part
        reverse(nums, ind + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {

        while(start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
