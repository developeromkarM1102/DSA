package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FreqSort {

    public String frequencySort(String s) {

        //Counting frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Putting characters into a list
        List<Character> chars = new ArrayList<>(map.keySet());

        //Sort by frequency descending
        chars.sort((a, b) -> map.get(b) - map.get(a));

        //Building answer
        StringBuilder ans = new StringBuilder();

        for (char ch : chars) {
            int freq = map.get(ch);

            while (freq-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
