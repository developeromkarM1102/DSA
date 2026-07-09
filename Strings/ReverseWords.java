package Strings;

public class ReverseWords {

    public String reverseWord(String s) {

        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // skip the spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int j = i;

            // find the first index of an word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            ans.append(s.substring(j + 1, i + 1));

            // Skip spaces before previous word
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            i = j;
        }
        return ans.toString();
    }
}
