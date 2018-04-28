package math.selfDividingNumbers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class SelfDividingNumbersTest {
    private int from;
    private int to;
    private List<Integer> expected;
    private Solution solution;

    public SelfDividingNumbersTest(int from, int to, List<Integer> expected) {
        this.from = from;
        this.to = to;
        this.expected = expected;
    }

    @Parameters(name = "{index}: selfDividingNumbers({0}, {1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 22, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)},
                {20, 30, Arrays.asList(22, 24)},
                {50, 150, Arrays.asList(55, 66, 77, 88, 99, 111, 112, 115, 122, 124, 126, 128, 132, 135, 144)}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void selfDividingNumbersSuite() {
        List<Integer> result = solution.selfDividingNumbers(from, to);
        assertThat(result, is(equalTo(expected)));
    }
}