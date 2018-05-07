package arrays.longestCommonPrefix;

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
public class LongestCommonPrefixTest {
    private String[] values;
    private String expected;
    private Solution solution;

    public LongestCommonPrefixTest(String[] values, String expected) {
        this.values = values;
        this.expected = expected;
    }

    @Parameters(name = "{index}: longestCommonPrefix({0}) = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"abcdeffa", "abcqwertyy", "abcuba"}, "abc"},
                {new String[]{"flower", "flow", "flight"}, "fl"},
                {new String[]{"dog", "racecar", "car"}, ""},
                {new String[]{}, ""},
                {null, ""}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void longestCommonPrefixSuite() {
        String result = solution.longestCommonPrefix(values);
        assertThat(result, is(equalTo(expected)));
    }
}