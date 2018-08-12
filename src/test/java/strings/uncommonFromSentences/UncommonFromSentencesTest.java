package strings.uncommonFromSentences;

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
public class UncommonFromSentencesTest {
    private String firstString;
    private String secondString;
    private String[] expected;
    private Solution solution;

    public UncommonFromSentencesTest(String firstString, String secondString, String[] expected) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: uncommonFromSentences(\"{0}\", \"{1}\") = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"this apple is sweet", "this apple is sour", new String[]{"sweet", "sour"}},
                {"apple apple", "banana", new String[]{"banana"}},
                {"one two three", "four five six", new String[]{"one", "two", "three", "four", "five", "six"}}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void uncommonFromSentencesTest() {
        String[] result = solution.uncommonFromSentences(firstString, secondString);
        assertThat(result, is(equalTo(expected)));
    }
}