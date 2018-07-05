package strings.buddyStrings;

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
public class BuddyStringsTest {
    private String firstString;
    private String secondString;
    private boolean expected;
    private Solution solution;

    public BuddyStringsTest(String firstString, String secondString, boolean expected) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: buddyString(\"{0}\", \"{1}\") = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ab", "ba", true},
                {"ab", "ab", false},
                {"aa", "aa", true},
                {"aaaaaaabc", "aaaaaaacb", true},
                {"", "aa", false}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void buddyStringsSuite() {
        boolean result = solution.buddyStrings(firstString, secondString);
        assertThat(result, is(equalTo(expected)));
    }
}