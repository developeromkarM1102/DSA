package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class AllStringPermutation {

    static void solve(String s, String output, ArrayList<String> ans) {

        if (s.isEmpty()) {
            ans.add(output);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remString = s.substring(0, i) + s.substring(i + 1);

            //recursion call
            solve(remString, output + ch, ans);
        }
    }

    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        solve(s, "", ans);
        Collections.sort(ans);
        return ans;
    }
}
