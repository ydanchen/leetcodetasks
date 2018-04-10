package strings.addStrings;

/**
 * 415. Add Strings
 * <p>
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * <p>
 * Note:
 * <p>
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        int i1 = num1.length() - 1, i2 = num2.length() - 1, transfer = 0, sum = 0;
        int c1, c2;
        StringBuffer sb = new StringBuffer();
        while (i1 >= 0 || i2 >= 0) {
            c1 = (i1 >= 0) ? (int) num1.charAt(i1) - 48 : 0;
            c2 = (i2 >= 0) ? (int) num2.charAt(i2) - 48 : 0;
            sum = c1 + c2 + transfer;
            if (sum > 9) {
                sum = sum % 10;
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
