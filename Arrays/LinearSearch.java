public class LinearSearch {

    int LinearSearch(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){

                System.out.println("\nfound at " + i);
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 40;

        LinearSearch ob = new LinearSearch();
        ob.LinearSearch(arr, target);

}
}
