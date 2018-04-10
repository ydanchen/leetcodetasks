package strings.excelSheetColumnTitle;

/**
 * 168. Excel Sheet Column Title
 * <p>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 */
public class Solution {
    public String convertToTitle(int n) {
        int temp;
        StringBuilder title = new StringBuilder();
        while (n > 0) {
            temp = (n - 1) % 26;
            title.insert(0, (char) (temp + 'A'));
            n = (n - temp - 1) / 26;
        }
        return title.toString();
    }
}
