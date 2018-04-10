package strings.excelSheetColumnTitle;

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
public class ConvertToTitleTest {
    private int value;
    private String expected;
    private Solution solution;

    public ConvertToTitleTest(int value, String expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name = "{index}: convertToTitle({0}) = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "A"},
                {2, "B"},
                {3, "C"},
                {4, "D"},
                {26, "Z"},
                {27, "AA"},
                {28, "AB"},
                {79, "CA"},
                {108, "DD"},
                {702, "ZZ"}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void convertToTitleSuite() {
        assertThat(solution.convertToTitle(value), is(equalTo(expected)));
    }
}