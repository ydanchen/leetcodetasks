package strings.isValidParentheses;

import java.util.LinkedList;

/**
 * 20. Valid Parentheses
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 */
public class Solution {
    public boolean isValid(String s) {
        String openBraces = "({[";
        String closeBraces = ")}]";
        int openCount = 0;
        int closeCount = 0;

        if (s.length() < 2 || closeBraces.indexOf(s.charAt(0)) != -1)
            return false;

        int index = 0;
        LinkedList<Integer> stack = new LinkedList<>();

        while (index < s.length()) {
            while (index < s.length() && openBraces.indexOf(s.charAt(index)) != -1) {
                stack.push(openBraces.indexOf(s.charAt(index)));
                openCount++;
                index++;
            }
            while (index < s.length() && closeBraces.indexOf(s.charAt(index)) != -1) {
                if (stack.size() > 0 && stack.pop() != closeBraces.indexOf(s.charAt(index)))
                    return false;
                closeCount++;
                index++;
            }
        }
        return openCount == closeCount;
    }
}