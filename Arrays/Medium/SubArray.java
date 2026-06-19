package Medium;
public class SubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
        int sum = 0;
        int Target = 9;

        // This is to find the subarray with the given target sum

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == Target){
                    System.out.println("Target found at index: "+i+" to "+j);
                }
            }
            sum = 0; 
        }
    }
}
