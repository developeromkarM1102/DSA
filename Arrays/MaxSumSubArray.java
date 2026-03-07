public class MaxSumSubArray {
    //Brute Force solution
    public static void main(String[] args) {
       int arr[]={1,-2,3,2,5};
       int n=5;
       
       int maxSum=Integer.MIN_VALUE;

       for(int st=0;st<n;st++){
        for(int end=st;end<n;end++){
            int sum=0;
            for(int i=st;i<=end;i++){
                sum+=arr[i];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
       }
         System.out.println("\nMax sum is " + maxSum);
    }
}
