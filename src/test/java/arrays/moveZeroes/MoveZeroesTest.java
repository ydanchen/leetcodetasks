package arrays.moveZeroes;

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
public class MoveZeroesTest {
    private int[] value;
    private int[] expected;
    private Solution solution;

    public MoveZeroesTest(int[] value, int[] expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name = "{index}: moveZeroes({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}},
                {new int[]{2, 1}, new int[]{2, 1}},
                {new int[]{0, 0, 1}, new int[]{1, 0, 0}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void moveZeroesSuite() {
        solution.moveZeroes(value);
        assertThat(value, is(equalTo(expected)));
    }
}