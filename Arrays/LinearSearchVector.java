import java.util.Vector;
public class LinearSearchVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        int arr[] = {10,20,30,40,50};
        int target = 40;

        for(int i=0;i<arr.length;i++){
            v.add(arr[i]);
        }

        for(int i=0;i<v.size();i++){
            if(v.get(i)==target){
                System.out.println("\nfound at " + i);
                break;
            }
        }
        
}
}
