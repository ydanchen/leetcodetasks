package strings.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 * <p>
 * Write a program that outputs the string representation of numbers from 1 to n.
 * <p>
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 * <p>
 * Example:
 * n = 15,
 *
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.delete(0, sb.length());
            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");
            result.add(sb.length() > 0 ? sb.toString() : Integer.toString(i));
        }
        return result;
    }
}
