package StringsQ;

public class CharInString {
    
    public int searchCharacter(String s, char ch) {
        
        int n = s.length();

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == ch) {
                return i;
            }
        }

        return -1;
    }
}
