package strings.firstUniqChar;

/**
 * 387. First Unique Character in a String
 * <p>
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i)))
                return i;
        return -1;
    }
}
