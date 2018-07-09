package math.countPrimes;

/**
 * 204. Count Primes
 * <p>
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Example:
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (isPrime(i)) count++;
        return count;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n > 2 && n % 2 == 0)
            return false;
        int top = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < top; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}