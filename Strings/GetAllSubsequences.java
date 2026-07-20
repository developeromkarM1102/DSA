package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetAllSubsequences {

    static void getAllSubsequences(String s, int index, StringBuilder output, List<String> ans) {

        // base case
        if (index >= s.length()) {
            String Subsequence = output.toString();
            ans.add(Subsequence);
            return;
        }

        // include - exclude pattern
        char ch = s.charAt(index);
        // include case
        output.append(ch);
        getAllSubsequences(s, index + 1, output, ans);
        // exclude case
        // this is for deleting last append char
        output.deleteCharAt(output.length() - 1);
        getAllSubsequences(s, index + 1, output, ans);
    }

    public List<String> powerSet(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;

        getAllSubsequences(s, index, output, ans);
        Collections.sort(ans);
        return ans;
    }
}
