package Medium;

public class SearchInAlmostSortedArr {
    
        public int findTarget(int arr[], int k) {
        // code here
        int  n = arr.length;
        int s = 0;
        int e = n-1;
        
        while(s<=e){
            int mid = s + (e-s) / 2;
            if(arr[mid]==k){
                return mid;
            }
            if(mid - 1 >= 0 && arr[mid - 1]==k){
                return mid - 1;
            }
            if(mid + 1 < n && arr[mid + 1]==k){
                return mid + 1;
            }
            
            if(k>arr[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
