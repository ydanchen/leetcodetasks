package strings.excelSheetColumnNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class TitleToNumberTest {
    private String value;
    private int expected;
    private Solution solution;

    public TitleToNumberTest(String value, int expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name = "{index}: titleToNumber(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"A", 1},
                {"B", 2},
                {"C", 3},
                {"D", 4},
                {"E", 5},
                {"AA", 27},
                {"AB", 28},
                {"CA", 79},
                {"DD", 108},
                {"ZZ", 702}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void titleToNumberSuite() {
        assertThat(solution.titleToNumber(value), is(equalTo(expected)));
    }
}