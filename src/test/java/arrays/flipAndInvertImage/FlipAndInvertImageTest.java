package arrays.flipAndInvertImage;

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
public class FlipAndInvertImageTest {
    private int[][] image;
    private int[][] expected;
    private Solution solution;

    public FlipAndInvertImageTest(int[][] image, int[][] expected) {
        this.image = image;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: flipAndInvertArray(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}, new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}},
                {new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}, new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void flipAndInvertImageSuite() {
        int[][] result = solution.flipAndInvertImage(image);
        assertThat(result, is(equalTo(expected)));
    }
}