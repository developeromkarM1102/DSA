package StringsQ;

public class removeAlloccurance {
    public static void main(String[] args) {
        String s = "ababca";
        char c = 'a';
        
        // Remove all occurrences of 'c' from 's'
        s = s.replace(String.valueOf(c), "");

        System.out.println(s);
    }
}
