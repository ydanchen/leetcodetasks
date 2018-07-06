package strings.intToRoman;

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
public class IntToRomanTest {
    private int number;
    private String expected;
    private Solution solution;

    public IntToRomanTest(int number, String expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: intToRoman({0}) = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, "III"},
                {4, "IV"},
                {9, "IX"},
                {58, "LVIII"},
                {100, "C"},
                {1994, "MCMXCIV"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void intToRomanSuite() {
        String result = solution.intToRoman(number);
        assertThat(result, is(equalTo(expected)));
    }
}