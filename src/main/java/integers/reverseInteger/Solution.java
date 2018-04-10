package integers.reverseInteger;

/**
 * 7. Reverse Integer
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output:  321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Solution {
    public int reverse(int x) {
        int temp = 0;
        int sign = (x < 0) ? -1 : 1;
        x *= sign;
        long result = 0;
        while (x > 0) {
            temp = x % 10;
            result = result * 10 + temp;
            x /= 10;
        }
        if (result > 0x7fffffff)
            return 0;
        return (int) result * sign;
    }
}
