package arrays.numberOfLines;

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
public class NumberOfLinesTest {
    private int[] widths;
    private String letters;
    private int[] expected;
    private Solution solution;

    public NumberOfLinesTest(int[] widths, String letters, int[] expected) {
        this.widths = widths;
        this.letters = letters;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: numberOfLines({0}, \"{1}\") = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyz", new int[]{3, 60}},
                {new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "bbbcccdddaaa", new int[]{2, 4}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void numberOfLinesSuite() {
        int[] result = solution.numberOfLines(widths, letters);
        assertThat(result, is(equalTo(expected)));
    }
}