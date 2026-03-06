import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println(v);

        v.remove(1);

        System.out.println(v);
    }
}
