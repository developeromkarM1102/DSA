package LeetcodeQuestions;

public class FirstAndLastOccurrences {

    //Using Linear Search
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        //checking for an first element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;
            }
        }

        //if target is not there no need to check for last index 
        //return directly -1 and return 
        if (first == -1) {
            return new int[] { -1, -1 };
        }

        //start checking from last index assign the last elem when they occurres 
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                last = i;
                break;
            }
        }
        return new int[] { first, last };
    }
}