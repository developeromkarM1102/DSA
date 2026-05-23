package Practice;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Three");
        map.put(null, "NullValue");
        map.put(null, "AnotherNullValue");

        System.out.println(map.get(1) + ", " + map.get(null));

        //In a HashMap, when a duplicate key (in this case, 1 and null) is inserted, the new value replaces the old one. So, the value for key 1 becomes "Three," and the value for null becomes "AnotherNullValue."
    }
}
