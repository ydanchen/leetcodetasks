package strings.backspaceCompare;

/**
 * 844. Backspace String Compare
 *
 * Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 *
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 *
 * Example 3:
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 *
 * Example 4:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 *
 * Note:
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 */
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        return decode(S).equals(decode(T));
    }

    private String decode(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '#') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
