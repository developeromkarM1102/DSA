package Strings;

public class SmallestPalindrome {

    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {

            // Add half of the occurrences
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }

            // Store the odd character (if any)
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append(left);

        if (middle != 0) {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}
