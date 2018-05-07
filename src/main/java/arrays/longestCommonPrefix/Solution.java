package arrays.longestCommonPrefix;

/**
 * 14. Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";

        int depth = Integer.MAX_VALUE, step = 0;
        StringBuilder prefix = new StringBuilder();
        for (String str : strs)
            if (str.length() < depth)
                depth = str.length();
        while (step < depth) {
            if (allEqualAt(strs, step))
                prefix.append(strs[0].charAt(step));
            else
                break;
            step++;
        }
        return prefix.toString();
    }

    private boolean allEqualAt(String[] strs, int index) {
        for (int i = 1; i < strs.length; i++)
            if (strs[i].charAt(index) != strs[i - 1].charAt(index))
                return false;
        return true;
    }
}
