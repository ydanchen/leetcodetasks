package strings.isValidParentheses;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class IsValidParenthesesTest {
    private String inputValue;
    private boolean expected;

    public IsValidParenthesesTest(String inputValue, boolean expected) {
        this.inputValue = inputValue;
        this.expected = expected;
    }

    @Parameters(name = "{index}: isValid(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"()", true},
                {"()[]{}", true},
                {"(]", false},
                {"([)]", false},
                {"([])", true},
                {"[", false},
                {"}", false},
                {"){", false},
                {"[])", false},
                {"((((((", false},
                {"}]}]}}", false}
        });
    }

    @Test
    public void isValidParenthesesSuite() {
        Solution solution = new Solution();
        assertThat(solution.isValid(inputValue), is(expected));
    }
}
