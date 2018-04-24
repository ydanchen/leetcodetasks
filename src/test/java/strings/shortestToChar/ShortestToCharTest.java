package strings.shortestToChar;

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
public class ShortestToCharTest {
    private String stringValue;
    private char charValue;
    private int[] expected;
    private Solution solution;

    public ShortestToCharTest(String stringValue, char charValue, int[] expected) {
        this.stringValue = stringValue;
        this.charValue = charValue;
        this.expected = expected;
    }

    @Parameters(name = "{index}: shortestToChar(\"{0}\", \'{1}\') = [{2}]")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"loveleetcode", 'e', new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}},
                {"abbb", 'a', new int[]{0, 1, 2, 3}},
                {"thisismystring", 'i', new int[]{2, 1, 0, 1, 0, 1, 2, 3, 3, 2, 1, 0, 1, 2}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void shortestToCharSuite() {
        int[] result = solution.shortestToChar(stringValue, charValue);
        assertThat(result, is(equalTo(expected)));
    }
}