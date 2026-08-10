package LeetcodeQuestions;

public class IndexOf1stOccurInStr {

    public int strStr(String haystack, String needle) {

        int hLen = haystack.length();
        int nLen = needle.length();
        
        // Needle cannot fit if it is longer than the haystack
        if (hLen < nLen) {
            return -1;
        }
        
        // Check every window of size nLen
        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
