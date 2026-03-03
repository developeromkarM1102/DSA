public class smallest_in_array {
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        int smallest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("\nsmallest no of array is: " + smallest);
    }
}
