package LeetcodeQuestions;

import java.util.HashMap;

public class IsomorphicString {
    
        public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> FromStoT = new HashMap<>();
        HashMap<Character, Character> FromTtoS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char Ch1 = s.charAt(i);
            char Ch2 = t.charAt(i);

            //checking from S to T
            if (FromStoT.containsKey(Ch1)) {
                if (FromStoT.get(Ch1) != Ch2) {
                    return false;
                }
            } else {
                FromStoT.put(Ch1, Ch2);
            }

            //checking from T to S
            if (FromTtoS.containsKey(Ch2)) {
                if (FromTtoS.get(Ch2) != Ch1) {
                    return false;
                }
            } else {
                FromTtoS.put(Ch2, Ch1);
            }
        }
        return true;
    }
}
