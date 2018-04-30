package arrays.isOneBitCharacter;

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
public class IsOneBitCharacterTest {
    private int[] bits;
    private boolean expected;
    private Solution solution;

    public IsOneBitCharacterTest(int[] bits, boolean expected) {
        this.bits = bits;
        this.expected = expected;
    }

    @Parameters(name = "{index}: isOneBitCharacter({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 0}, true},
                {new int[]{0, 1, 0}, false},
                {new int[]{1, 0, 0}, true},
                {new int[]{1, 1, 1, 0}, false}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void isOneBitCharacter() {
        boolean result = solution.isOneBitCharacter(bits);
        assertThat(result, is(equalTo(expected)));
    }
}