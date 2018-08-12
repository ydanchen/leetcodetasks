package arrays.twoSum;

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
public class TwoSumTest {
    private int[] values;
    private int target;
    private int[] expected;
    private Solution solution;

    public TwoSumTest(int[] values, int target, int[] expected) {
        this.values = values;
        this.target = target;
        this.expected = expected;
    }

    @Parameters(name = "{index}: twoSum({0}, {1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                {new int[]{1, 2, 3, 4}, 5, new int[]{0, 3}},
                {new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 10, new int[]{0, 8}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void twoSumSuite() {
        int[] result = solution.twoSum(values, target);
        assertThat(result, is(equalTo(expected)));
    }
}