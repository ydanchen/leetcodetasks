package arrays.pivotIndex;

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
public class PivotIndexTest {
    private int[] numbers;
    private int expected;
    private Solution solution;

    public PivotIndexTest(int[] numbers, int expected) {
        this.numbers = numbers;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: pivotIndex(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 7, 3, 6, 5, 6}, 3},
                {new int[]{1, 2, 3}, -1},
                {new int[]{-1, -1, -1, 0, 1, 1}, 0},
                {new int[]{-1, -1, 0, 1, 1, 0}, 5},
                {new int[]{}, -1}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void pivotIndexSuite() {
        int result = solution.pivotIndex(numbers);
        assertThat(result, is(equalTo(expected)));
    }
}