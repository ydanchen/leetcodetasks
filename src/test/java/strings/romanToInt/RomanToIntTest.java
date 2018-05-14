package strings.romanToInt;

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
public class RomanToIntTest {
    private String romanNumber;
    private int expected;
    private Solution solution;

    public RomanToIntTest(String romanNumber, int expected) {
        this.romanNumber = romanNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: romanToInt(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"III", 3},
                {"IV", 4},
                {"IX", 9},
                {"X", 10},
                {"LVIII", 58},
                {"MCMXCIV", 1994}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void romanToIntSuite() {
        int integerValue = solution.romanToInt(romanNumber);
        assertThat(integerValue, is(equalTo(expected)));
    }
}