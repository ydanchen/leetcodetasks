package strings.addBinary;

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
public class AddBinaryTest {
    private String firstValue;
    private String secondValue;
    private String expected;

    public AddBinaryTest(String firstValue, String secondValue, String expected) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expected = expected;
    }

    @Parameters(name = "{index}: addBinary(\"{0}\", \"{1}\") = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1", "11", "100"},
                {"0", "0", "0"},
                {"0", "1", "1"},
                {"1", "0", "1"},
                {"1111", "1111", "11110"}
        });
    }

    @Test
    public void addBinarySuite() {
        Solution solution = new Solution();
        assertThat(solution.addBinary(firstValue, secondValue), is(equalTo(expected)));
    }
}
