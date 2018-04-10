package strings.validPalindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 125. Valid Palindrome
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class Solution {
    /**
     * Determines whether the passed string ia a palindrome or not
     * Imperative approach
     *
     * @return true if s is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        List<Character> chars = new ArrayList<>();
        for (char c : s.toLowerCase().toCharArray())
            if (Character.isLetter(c) || Character.isDigit(c))
                chars.add(c);
        for (int i = 0; i < chars.size() / 2; i++)
            if (!chars.get(i).equals(chars.get(chars.size() - i - 1)))
                return false;
        return true;
    }

    /**
     * Determines whether the passed string ia a palindrome or not
     * Functional approach
     *
     * @return true if s is a valid palindrome
     */
    public boolean isPalindromeFun(String s) {
        if (s.length() == 0)
            return true;
        List<Character> chars = s.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        return IntStream.range(0, chars.size() / 2)
                .allMatch(i -> chars.get(i).equals(chars.get(chars.size() - i - 1)));
    }
}
