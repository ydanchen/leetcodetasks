package strings.uncommonFromSentences;

import java.util.ArrayList;
import java.util.List;

/**
 * 888. Uncommon Words from Two Sentences
 *
 * We are given two sentences A and B.  (A sentence is a string of space separated words.
 * Each word consists only of lowercase letters.)
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Return a list of all uncommon words.
 *
 * You may return the list in any order.
 *
 * Example 1:
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 *
 * Example 2:
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 */
public class Solution {
    private static final String SEPARATOR = "\\s+";

    public String[] uncommonFromSentences(String A, String B) {
        String[] aWords = A.split(SEPARATOR);
        String[] bWords = B.split(SEPARATOR);

        List<String> result = new ArrayList<>();

        for (String word : aWords)
            if (isWordUnique(word, aWords) && isWordNotInArray(word, bWords))
                result.add(word);

        for (String word : bWords)
            if (isWordUnique(word, bWords) && isWordNotInArray(word, aWords))
                result.add(word);

        return result.toArray(new String[0]);
    }

    private boolean isWordUnique(String wordToCheck, String[] wordSet) {
        int entryCount = 0;
        for (String wordEntry : wordSet)
            if (wordEntry.equalsIgnoreCase(wordToCheck))
                entryCount++;
        return entryCount == 1;
    }

    private boolean isWordNotInArray(String wordToCheck, String[] wordSet) {
        for (String entry : wordSet)
            if (entry.equalsIgnoreCase(wordToCheck))
                return false;
        return true;
    }
}
