package strings.validPalindrome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class ValidPalindromeTest {
    private String value;
    private boolean expected;

    public ValidPalindromeTest(String value, boolean expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name = "{index}: isPalindrome(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"A man, a plan, a canal: Panama", true},
                {"race a car", false},
                {"a.", true},
                {"", true},
                {"0P", false},
                {"Madam", true},
                {"Race car", true},
                {"Was it a car or a cat I saw?", true}
        });
    }

    @Test
    public void isPalindromeSuite() {
        Solution solution = new Solution();
        assertThat(solution.isPalindrome(value), is(expected));
    }
}