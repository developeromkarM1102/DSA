package Medium;

public class PivotIndexOfRotatedArr {
    
    public static int pivotIdxInRotatedArr(int arr []){

        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if(arr[s]<arr[e]){
            return 0;
        }

        while(s<=e){
            int mid = s + (e-s) / 2;
            if(arr[mid]<arr[n-1]){
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {3,4,5,1,2};
        int ans = pivotIdxInRotatedArr(arr);
        System.out.println("Pivot Idx is at : " + ans);
    }
}
