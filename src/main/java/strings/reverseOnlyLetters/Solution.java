package strings.reverseOnlyLetters;

/**
 * 917. Reverse Only Letters
 *
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place,
 * and all letters reverse their positions.
 *
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 *
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 *
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 *
 * Note:
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] reverse = S.toCharArray();
        char tmp;
        for (int left = 0, right = S.length() - 1; left < right; left++, right--) {
            while (!Character.isLetter(reverse[left]) && left < right) left++;
            while (!Character.isLetter(reverse[right]) && right > left) right--;
            tmp = reverse[left];
            reverse[left] = reverse[right];
            reverse[right] = tmp;
        }
        return new String(reverse);
    }
}
