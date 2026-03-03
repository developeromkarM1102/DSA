class largest_in_array{
    public static void main(String[] args) {
        int largest =0;
        int arr[]={20,50,10,30,40};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        System.out.println("\nLargest element in array is : " + largest);
    }
}