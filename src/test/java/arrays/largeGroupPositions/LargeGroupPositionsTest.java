package arrays.largeGroupPositions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class LargeGroupPositionsTest {
    private String input;
    private List<List<Integer>> expected;
    private Solution solution;

    public LargeGroupPositionsTest(String input, List<List<Integer>> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: largeGroupPositions(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {"abbxxxxzzy", asList(asList(3, 6))},
                {"abc", Collections.emptyList()},
                {"abcdddeeeeaabbbcd", asList(asList(3, 5), asList(6, 9), asList(12, 14))},
                {"aa", Collections.emptyList()},
                {"aaa", asList(asList(0, 2))}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void largeGroupPositionsSuite() {
        List<List<Integer>> result = solution.largeGroupPositions(input);
        assertThat(result, is(equalTo(expected)));
    }
}