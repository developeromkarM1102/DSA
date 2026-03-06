//it will print the number which is not repeated in the array
class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int val:nums)
        {
            ans ^= val;
        }
        return ans;
    }
}