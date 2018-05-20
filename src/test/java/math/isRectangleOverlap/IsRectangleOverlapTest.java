package math.isRectangleOverlap;

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
public class IsRectangleOverlapTest {
    private int[] rec1;
    private int[] rec2;
    private boolean expected;
    private Solution solution;

    public IsRectangleOverlapTest(int[] rec1, int[] rec2, boolean expected) {
        this.rec1 = rec1;
        this.rec2 = rec2;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: isRectangleOverlap(\"{0}\", \"{1}\") = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}, true},
                {new int[]{1, 1, 3, 3}, new int[]{0, 0, 2, 2}, true},
                {new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}, false},
                {new int[]{1, 0, 2, 1}, new int[]{0, 0, 1, 1}, false},
                {new int[]{5, 15, 8, 18}, new int[]{0, 3, 7, 9}, false},
                {new int[]{0, 3, 7, 9}, new int[]{5, 15, 8, 18}, false},
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void isRectangleOverlapSuite() {
        boolean result = solution.isRectangleOverlap(rec1, rec2);
        assertThat(result, is(equalTo(expected)));
    }
}