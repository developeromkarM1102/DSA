class reverse_an_array {
    public void reverse(int[] arr, int n,int i,int j) {
       
        if(i>=j) return;
        
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;

        reverse(arr,n,i+1,j-1);
       
    }
}

