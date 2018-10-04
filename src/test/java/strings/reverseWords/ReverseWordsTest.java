package strings.reverseWords;

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
public class ReverseWordsTest {
    private String string;
    private String expected;
    private Solution solution;

    public ReverseWordsTest(String string, String expected) {
        this.string = string;
        this.expected = expected;
    }

    @Parameterized.Parameters(name="{index}: reverseWords(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void reverseWordsSuite() {
        String result = solution.reverseWords(string);
        assertThat(result, is(equalTo(expected)));
    }
}