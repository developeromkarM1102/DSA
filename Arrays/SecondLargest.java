public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Second largest element is: " + secondLargest);

    }
}
