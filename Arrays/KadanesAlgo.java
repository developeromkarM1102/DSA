public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs>ms){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        System.out.println("\nMax sum is " + ms);
    }
}
