package arrays.arrayPartitionI;

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
public class ArrayPartitionITest {
    private int[] input;
    private int expected;
    private Solution solution;

    public ArrayPartitionITest(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters(name = "{index}: arrayPartition({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 3, 2}, 4},
                {new int[]{8, 9, 1, 1, 5, 7, 4, 2, 8, 6, 4, 3}, 27},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 20}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void arrayPartitionSuite() {
        int result = solution.arrayPairSum(input);
        assertThat(result, is(equalTo(expected)));
    }
}