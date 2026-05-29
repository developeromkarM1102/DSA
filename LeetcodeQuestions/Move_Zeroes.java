package LeetcodeQuestions;

public class Move_Zeroes {

    //Brute Force Approach
    
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int ans [] = new int[n];

        int s=0; int e=n-1;

        for(int i=0;i<n;i++){
            if(nums[i]!=0)
                ans[s++]=nums[i];
            else
                ans[e--]=nums[i]; 
        }
        
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }

    }
}