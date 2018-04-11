package strings.strStr;

/**
 * 28. Implement strStr()
 *
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;
        if (needle.length() == 0)
            return 0;
        int c;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            c = 0;
            while (c < needle.length() && haystack.charAt(i + c) == needle.charAt(c))
                c++;
            if (c == needle.length())
                return i;
        }
        return -1;
    }
}
