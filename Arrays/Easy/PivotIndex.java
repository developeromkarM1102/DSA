package Easy;

public class PivotIndex {
    
    public static int pivotIndex(int arr []){

        int n = arr.length;
        int leftSum[] = new int [n];
        int RightSum[] = new int [n];

        leftSum[0]=arr[0];
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        RightSum[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            RightSum[i] = RightSum[i+1] + arr[i];
        }

        for(int i=0;i<n;i++){
            if(leftSum[i] == RightSum[i]){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int arr [] = {12,19,2,-20,6,14,-1};
        int ans = pivotIndex(arr);
        System.out.println(ans);
    }
}
