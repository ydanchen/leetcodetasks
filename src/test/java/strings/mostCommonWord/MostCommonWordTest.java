package strings.mostCommonWord;

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
public class MostCommonWordTest {
    private String paragraph;
    private String[] bannedWords;
    private String expected;
    private Solution solution;

    public MostCommonWordTest(String paragraph, String[] bannedWords, String expected) {
        this.paragraph = paragraph;
        this.bannedWords = bannedWords;
        this.expected = expected;
    }

    @Parameters(name = "{index}: mostCommonWord(\"{0}\", {1}) = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"This is the paragraph. This is word. There are a lot of words. ", new String[]{"is"}, "this"},
                {"Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}, "ball"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void mostCommonWordSuite() {
        String result = solution.mostCommonWord(paragraph, bannedWords);
        assertThat(result, is(equalTo(expected)));
    }
}