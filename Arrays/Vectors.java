import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        //it is like an array but arrays are statics so we cannot add elements in that 
        //vectors are dynamics in nature where we can add and delete the elements 

        v.add(10); //to add elements in vectors
        v.add(20); //to add elements in vectors
        v.add(30); //to add elements in vectors

        System.out.println(v);

        v.remove(1); // to remove the element
        v.add(40);

        System.out.println(v.firstElement());//to get an first element in vectors
        System.out.println(v.lastElement());//to get an last element in vector
    
    }
}
