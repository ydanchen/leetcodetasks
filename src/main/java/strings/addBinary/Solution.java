package strings.addBinary;

/**
 * 67. Add Binary
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class Solution {
    public String addBinary(String a, String b) {
        int i1 = a.length() - 1, i2 = b.length() - 1, transfer = 0, sum;
        int c1, c2;
        StringBuilder sb = new StringBuilder();
        while (i1 >= 0 || i2 >= 0) {
            c1 = (i1 >= 0) ? (int) a.charAt(i1) - 48 : 0;
            c2 = (i2 >= 0) ? (int) b.charAt(i2) - 48 : 0;
            sum = c1 + c2 + transfer;
            if (sum > 1) {
                sum = sum % 2;
                transfer = 1;
            } else transfer = 0;
            sb.insert(0, (char) (sum + 48));
            i1--;
            i2--;
        }
        if (transfer > 0)
            sb.insert(0, '1');
        return new String(sb);
    }
}
