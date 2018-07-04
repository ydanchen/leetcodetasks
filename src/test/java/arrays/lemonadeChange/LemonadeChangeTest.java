package arrays.lemonadeChange;

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
public class LemonadeChangeTest {
    private int[] bills;
    private boolean expected;
    private Solution solution;

    public LemonadeChangeTest(int[] bills, boolean expected) {
        this.bills = bills;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: lemonadeChange(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{5, 5, 5, 10, 20}, true},
                {new int[]{5, 5, 10}, true},
                {new int[]{10, 10}, false},
                {new int[]{5, 5, 10, 10, 20}, false},
                {new int[]{5, 5, 20, 5, 5, 10, 5, 10, 5, 20}, false},
                {new int[]{5, 5, 5, 10, 20}, true}
        });
    }

    @Before
    public void init() {
        this.solution = new Solution();
    }

    @Test
    public void lemonadeChangeSuite() {
        boolean result = solution.lemonadeChange(bills);
        assertThat(result, is(equalTo(expected)));
    }
}