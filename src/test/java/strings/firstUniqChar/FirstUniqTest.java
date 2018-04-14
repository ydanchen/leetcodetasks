package strings.firstUniqChar;

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
public class FirstUniqTest {
    private String value;
    private int expected;
    private Solution solution;

    public FirstUniqTest(String value, int expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name = "{index}: firstUniqChar(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"leetcode", 0},
                {"loveleetcode", 2},
                {"qwertyuiopasdfghjkl", 0},
                {"abcdefghijklmnop", 0},
                {"aabbccddeeff", -1}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void firstUniqCharSuite() {
        int index = solution.firstUniqChar(value);
        assertThat(index, is(equalTo(expected)));
    }
}