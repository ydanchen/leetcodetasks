package strings.reverseOnlyLetters;

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
public class ReverseOnlyLettersTest {
    private String inputString;
    private String expected;
    private Solution solution;

    public ReverseOnlyLettersTest(String inputString, String expected) {
        this.inputString = inputString;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: reverseOnlyLeters(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"7_28]", "7_28]"},
                {"ab-cd", "dc-ba"},
                {"a-bC-dEf-ghIj", "j-Ih-gfE-dCba"},
                {"Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void reverseOnlyLettersSuite() {
        String result = solution.reverseOnlyLetters(inputString);
        assertThat(result, is(equalTo(expected)));
    }
}