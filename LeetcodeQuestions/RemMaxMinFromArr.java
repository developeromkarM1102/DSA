package LeetcodeQuestions;

public class RemMaxMinFromArr {

    public int minimumDeletions(int[] nums) {

        int max = 0;
        int min = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] < nums[min]) {
                min = i;
            } else if(nums[i] > nums[max]) {
                max = i;
            }
        }


        int left = Math.max(min, max) + 1;

        int right = n - Math.min(min, max);

        int both = Math.min(min, max) + 1 + n - Math.max(min, max);

        return Math.min(left, Math.min(right, both));
    }
}