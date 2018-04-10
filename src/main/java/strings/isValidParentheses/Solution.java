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
    private final static String OPEN_BRACES = "({[";
    private final static String CLOSE_BRACES = ")}]";

    public boolean isValid(String s) {
        if (s.length() < 2 || CLOSE_BRACES.indexOf(s.charAt(0)) != -1)
            return false;

        int openCount = 0;
        int closeCount = 0;
        int index = 0;
        LinkedList<Integer> stack = new LinkedList<>();

        while (index < s.length()) {
            while (index < s.length() && OPEN_BRACES.indexOf(s.charAt(index)) != -1) {
                stack.push(OPEN_BRACES.indexOf(s.charAt(index)));
                openCount++;
                index++;
            }
            while (index < s.length() && CLOSE_BRACES.indexOf(s.charAt(index)) != -1) {
                if (stack.size() > 0 && stack.pop() != CLOSE_BRACES.indexOf(s.charAt(index)))
                    return false;
                closeCount++;
                index++;
            }
        }
        return openCount == closeCount;
    }
}