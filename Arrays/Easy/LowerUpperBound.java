package Easy;

public class LowerUpperBound {
    
    public static int getLowerBound(int arr[] , int target){

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end-start) /2;

            if(arr[mid]>=target){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static int getUpperBound(int arr[] , int target){

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end-start) /2;

            if(arr[mid]<=target){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {10,10,30,30,30,30,30,40,50};
        int target = 30;
        //int ans = getLowerBound(arr, target);
        int ans = getUpperBound(arr,target);
        System.out.println("ans : " + ans);
    }
}
