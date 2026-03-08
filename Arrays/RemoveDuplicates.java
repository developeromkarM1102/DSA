public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5};
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
