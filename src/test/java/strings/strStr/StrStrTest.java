package strings.strStr;

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
public class StrStrTest {
    private String haystack;
    private String needle;
    private int expected;
    private Solution solution;

    public StrStrTest(String haystack, String needle, int expected) {
        this.haystack = haystack;
        this.needle = needle;
        this.expected = expected;
    }

    @Parameters(name = "{index}: strStr(\"{0}\", \"{1}\") = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"","", 0},
                {"a","", 0},
                {"aaa","a", 0},
                {"hello","ll", 2},
                {"mississippi","issip", 4},
                {"hello, my dear friend","dear", 10},
                {"hello, my dear friend","friend", 15},
                {"aaaaa","bba", -1}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void strStrSuite() {
        int result = solution.strStr(haystack, needle);
        assertThat(result, is(equalTo(expected)));
    }
}