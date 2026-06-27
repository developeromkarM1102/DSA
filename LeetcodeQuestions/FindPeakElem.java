package LeetcodeQuestions;

public class FindPeakElem {

    public static int findPeakElement(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 2;
        int ans = n - 1;

        if (n == 1)
            return 0;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] < nums[mid + 1]) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int nums [] = {1,2,1,3,5,6,4};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

}