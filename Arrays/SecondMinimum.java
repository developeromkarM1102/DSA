public class SecondMinimum {
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest element is: " + smallest);
        System.out.println("Second smallest element is: " + secondSmallest);
    }
}
