package strings.myAtoi;

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
public class MyAtoiTest {
    private String valueToConvert;
    private int expected;
    private Solution solution;

    public MyAtoiTest(String valueToConvert, int expected) {
        this.valueToConvert = valueToConvert;
        this.expected = expected;
    }

    @Parameters(name = "{index}: myAtoi(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123456789", 123456789},
                {"42", 42},
                {"   -42", -42},
                {"4193 with words", 4193},
                {"words and 987", 0},
                {"-91283472332", -2147483648},
                {"3.14159", 3},
                {"+-2", 0},
                {"+1", 1},
                {"  -0012a42", -12},
                {"   +0 123", 0}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void myAtoiSuite() {
        int result = solution.myAtoi(valueToConvert);
        assertThat(result, is(equalTo(expected)));
    }
}