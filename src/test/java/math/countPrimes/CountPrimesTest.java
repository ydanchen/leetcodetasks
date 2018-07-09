package math.countPrimes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CountPrimesTest {
    private int primesLessThan;
    private int expected;
    private Solution solution;

    public CountPrimesTest(int primesLessThan, int expected) {
        this.primesLessThan = primesLessThan;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: primesCount({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 4},
                {100, 25},
                {1000, 168},
                {499979, 41537}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void primesCountSuite() {
        int result = solution.countPrimes(primesLessThan);
        assertThat(result, is(equalTo(expected)));
    }
}