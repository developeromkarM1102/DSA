package Strings;

public class LongestPalindromicString{

        public String longestPalindrome(String s) {

         if (s == null || s.length() < 2)
            return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            int left = i, right = i;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }

            // Even length
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLen);
    
    }
}