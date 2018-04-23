package strings.judgeRouteCircle;

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
public class JudgeCircleTest {
    private String input;
    private boolean expected;
    private Solution solution;

    public JudgeCircleTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters(name = "{index}: judgeCircle({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"UD", true},
                {"LL", false},
                {"UDLR", true},
                {"RR", false},
                {"LLRRLLRRUUDDUUDD", true}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void judgeCircleSuite() {
        boolean result = solution.judgeCircle(input);
        assertThat(result, is(equalTo(expected)));
    }
}