package strings.addStrings;

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
public class AddStringsTest {
    private String firstNumber;
    private String secondNumber;
    private String expected;

    public AddStringsTest(String firstNumber, String secondNumber, String expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameters(name = "{index}: addStrings(\"{0}\", \"{1}\") = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"0", "0", "0"},
                {"100", "100", "200"},
                {"123", "123", "246"},
                {"9999", "9999", "19998"},
                {"500", "500", "1000"}
        });
    }

    @Test
    public void addStringsSuite() {
        Solution solution = new Solution();
        assertThat(solution.addStrings(firstNumber, secondNumber), is(equalTo(expected)));
    }
}
