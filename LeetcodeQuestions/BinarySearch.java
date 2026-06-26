package LeetcodeQuestions;

public class BinarySearch {
    
    public int search(int[] nums, int target) {
        
        int ans = -1;
        int n = nums.length;
        int s=0;
        int e=n-1;

        while(s<=e){

            //int mid = (s+e)/2;

            //using following mid to avoid constraint overflowing

            int mid = s + (e - s) / 2;
            
            if(nums[mid]==target){
                ans = mid;
                break;
            }
            else if(nums[mid]<target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }

        }
            return ans;
    }
}
