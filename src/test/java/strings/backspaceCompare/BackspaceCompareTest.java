package strings.backspaceCompare;

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
public class BackspaceCompareTest {
    private String firstString;
    private String secondString;
    private boolean expected;
    private Solution solution;

    public BackspaceCompareTest(String firstString, String secondString, boolean expected) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: backspaceCompare(\"{0}\", \"{1}\") = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ab#c", "ad#c", true},
                {"ab##", "c#d#", true},
                {"a##c", "#a#c", true},
                {"a#c", "b", false},
                {"y#fo##f", "y#f#o##f", true}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void backspaceCompareSuite() {
        boolean result = solution.backspaceCompare(firstString, secondString);
        assertThat(result, is(equalTo(expected)));
    }
}