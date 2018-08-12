package integers.reverseInteger;

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
public class ReverseTest {
    private int value;
    private int expected;
    private Solution solution;

    public ReverseTest(int value, int expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameters(name = "{index}: reverse({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {123, 321},
                {-123, -321},
                {120, 21},
                {123456789, 987654321}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void reverseSuite() {
        assertThat(solution.reverse(value), is(equalTo(expected)));
    }
}
