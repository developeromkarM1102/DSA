public class Index_of_smallest {

    public static void main(String[] args) {
        int arr[]={20,50,80,40,30};
        int SmallestIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[SmallestIndex]){
                SmallestIndex =i;
            }
        }
        System.out.println("\nIndex of an smallest no is : " +SmallestIndex);
    }
}


