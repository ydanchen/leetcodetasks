package arrays.transpose;

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
public class TransposeTest {
    private int[][] matrix;
    private int[][] expected;
    private Solution solution;

    public TransposeTest(int[][] matrix, int[][] expected) {
        this.matrix = matrix;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: transpose({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}},
                {new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{1, 4}, {2, 5}, {3, 6}}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void transposeSuite() {
        int[][] result = solution.transpose(matrix);
        assertThat(result, is(equalTo(expected)));
    }
}