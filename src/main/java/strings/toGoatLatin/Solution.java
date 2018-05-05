package strings.toGoatLatin;

/**
 * 824. Goat Latin
 *
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase
 * and uppercase letters only.
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 * The rules of Goat Latin are as follows:
 *
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 *
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end,
 * then add "ma".
 * For example, the word "goat" becomes "oatgma".
 *
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 *
 * Example 1:
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 * Example 2:
 * Input: "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 *
 * Notes:
 * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
 * 1 <= S.length <= 150.
 */
public class Solution {
    public String toGoatLatin(String S) {
        StringBuilder goatPhrase = new StringBuilder();
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isVowelFirst(words[i]))
                goatPhrase.append(words[i]);
            else
                goatPhrase.append(shiftFirstToEnd(words[i]));
            goatPhrase.append("ma");
            for (int j = 0; j <= i; j++)
                goatPhrase.append("a");
            if (i < words.length - 1)
                goatPhrase.append(" ");
        }
        return goatPhrase.toString();
    }

    private boolean isVowelFirst(String s) {
        char c = Character.toLowerCase(s.charAt(0));
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private String shiftFirstToEnd(String s) {
        if (s.length() == 1) return s;
        return s.substring(1, s.length()) + s.charAt(0);
    }
}
