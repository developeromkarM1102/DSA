package LeetcodeQuestions;

public class PeakIndexFromMountainArr {

        public static int peakIndexInMountainArray(int[] arr) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;
        
        while(s < e){
            int mid = s + (e - s) / 2;

            if(arr[mid] < arr[mid+1]){

                s = mid + 1;
            }
            else{
                e = mid ;
            }
           
        }
        return s;
    }

    public static void main(String[] args) {
        int arr [] = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak at Index : " + ans);
    }
}
