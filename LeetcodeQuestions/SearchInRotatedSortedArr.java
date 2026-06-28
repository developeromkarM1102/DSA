package LeetcodeQuestions;

public class SearchInRotatedSortedArr {
    
        static int pivotIdxInRotatedArr(int arr[]) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        // Array is already sorted
        if(arr[s] <= arr[e]){
            return -1;
        }

        while(s <= e){

            int mid = s + (e - s) / 2;

            if(arr[mid] <= arr[n - 1]){
                e = mid - 1;
            }else{
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

    static int Binarysearch(int[] nums,int s,int e,int target){

        while(s <= e){

            int mid = s + (e - s) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int n = nums.length;
        int pivotIndex = pivotIdxInRotatedArr(nums);

        // Not rotated
        if(pivotIndex == -1){
            return Binarysearch(nums,0,n-1,target);
        }

        // Search in first half
        if(target >= nums[0] && target <= nums[pivotIndex]){
            return Binarysearch(nums,0,pivotIndex,target);
        }

        // if not present in first half directly Search in second half
        return Binarysearch(nums,pivotIndex+1,n-1,target);
    }
}
