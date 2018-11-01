package strings.toLowerCase;

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
public class ToLowerCaseTest {
    private String stringToLowerCase;
    private String expected;
    private Solution solution;

    public ToLowerCaseTest(String stringToLowerCase, String expected) {
        this.stringToLowerCase = stringToLowerCase;
        this.expected = expected;
    }

    @Parameterized.Parameters(name="{index}: toLowerCase(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Hello", "hello"},
                {"here", "here"},
                {"LOVELY", "lovely"},
                {"LoWeR CaSe StRiNg", "lower case string"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void toLowerCaseSuite() {
        String result = solution.toLowerCase(stringToLowerCase);
        assertThat(result, is(equalTo(expected)));
    }
}