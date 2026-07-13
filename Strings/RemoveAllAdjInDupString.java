package Strings;

public class RemoveAllAdjInDupString {

    public String removeDuplicates(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // if rightmost char == currentchar then delete it from string
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
                ans.deleteCharAt(ans.length() - 1);
            }
            // if not then add to string
            else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
