package Medium;

public class RearrangeElemBySign {

    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0; // Positive numbers go to even indices
        int neg = 1; // Negative numbers go to odd indices

        for (int num : nums) {

            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }

        return ans;
    }
}
