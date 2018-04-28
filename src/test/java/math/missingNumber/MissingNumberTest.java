package math.missingNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class MissingNumberTest {
    private int[] numbers;
    private int expected;
    private Solution solution;

    public MissingNumberTest(int[] numbers, int expected) {
        this.numbers = numbers;
        this.expected = expected;
    }

    @Parameters(name = "{index}: missingNumber({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 0, 1}, 2},
                {new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8},
                {new int[]{1, 2, 4, 5, 6, 7, 8, 0}, 3}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void missingNumberSuite() {
        int result = solution.missingNumber(numbers);
        assertThat(result, is(equalTo(expected)));
    }
}