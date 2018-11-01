package strings.toLowerCase;

/**
 * 709. To Lower Case
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * Example 1:
 * Input: "Hello"
 * Output: "hello"
 *
 * Example 2:
 * Input: "here"
 * Output: "here"
 *
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 */
public class Solution {
    public String toLowerCase(String str) {
        char[] lower = new char[str.length()];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                lower[i] = (char)(c + 32);
            else
                lower[i] = c;
        }
        return new String(lower);
    }
}
