package strings.shortestToChar;

/**
 * 821. Shortest Distance to a Character
 * <p>
 * Given a string S and a character C, return an array of integers representing the shortest distance from the
 * character C in the string.
 * <p>
 * Example 1:
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * <p>
 * Note:
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 */
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int l = 0, r = 0;
        int lmin, rmin;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                result[i] = 0;
                continue;
            } else {
                l = i - 1;
                r = i + 1;
                lmin = S.length();
                rmin = S.length();
                while (l >= 0 || r < S.length()) {
                    if (l >= 0 && S.charAt(l) == C && i - l < lmin) lmin = i - l;
                    if (r < S.length() && S.charAt(r) == C && r - i < rmin) rmin = r - i;
                    l--;
                    r++;
                }
                result[i] = lmin < rmin ? lmin : rmin;
            }
        }
        return result;
    }
}
