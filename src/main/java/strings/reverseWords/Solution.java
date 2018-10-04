package strings.reverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 557. Reverse Words in a String III
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving
 * whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class Solution {

    /*
     * Functional approach with streams
     */
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(e -> new StringBuilder(e).reverse())
                .collect(Collectors.joining(" "));
    }
}
