package strings.shiftingLetters;

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
public class ShiftingLettersTest {
    private String letters;
    private int[] shifts;
    private String expected;
    private Solution solution;

    public ShiftingLettersTest(String letters, int[] shifts, String expected) {
        this.letters = letters;
        this.shifts = shifts;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: shiftingLetters(\"{0}\", {1}) = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abc", new int[]{3, 5, 9}, "rpl"},
                {"abcdefg", new int[]{10, 100, 200, 300, 500, 1000, 10000}, "ulqzmhw"},
                {"test", new int[]{10, 8, 7, 6}, "yzfz"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void shiftingLettersSuite() {
        String result = solution.shiftingLetters(letters, shifts);
        assertThat(result, is(equalTo(expected)));
    }
}