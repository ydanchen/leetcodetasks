package arrays.isToeplitzMatrix;

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
public class IsToeplitzMatrixTest {
    private int[][] matrix;
    private boolean expected;
    private Solution solution;

    public IsToeplitzMatrixTest(int[][] matrix, boolean expected) {
        this.matrix = matrix;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: isToeplitzMatrix(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new int[][]{
                                {1, 2, 3, 4},
                                {5, 1, 2, 3},
                                {9, 5, 1, 2}
                        }, true
                },
                {
                        new int[][]{
                                {1, 2},
                                {2, 2}
                        }, false
                },
                {
                        new int[][]{
                                {5, 4, 3, 2},
                                {6, 5, 4, 3},
                                {7, 6, 5, 4},
                                {8, 7, 6, 5}
                        }, true
                }
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void isToeplitzMatrixSuite() {
        boolean result = solution.isToeplitzMatrix(matrix);
        assertThat(result, is(equalTo(expected)));
    }
}