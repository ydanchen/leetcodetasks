package arrays.largeGroupPositions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 830. Positions of Large Groups
 *
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large
 * group.
 *
 * The final answer should be in lexicographic order.
 *
 * Example 1:
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 *
 * Example 2:
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 *
 * Example 3:
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 */
public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        if (S == null || S.length() < 3) return Collections.emptyList();

        List<List<Integer>> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (i > 0) {
                if (S.charAt(i) == S.charAt(i - 1))
                    count++;
                else {
                    if (count >= 2)
                        result.add(Arrays.asList(i - 1 - count, i - 1));
                    count = 0;
                }
            }
        }
        if (count >= 2)
            result.add(Arrays.asList(S.length() - count - 1, S.length() - 1));
        return result;
    }
}
