package arrays.removeDuplicates;

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
public class RemoveDuplicatesTest {
    private int[] values;
    private int[] expectedValues;
    private int expectedLength;
    private Solution solution;

    public RemoveDuplicatesTest(int[] values, int[] expectedValues, int expectedLength) {
        this.values = values;
        this.expectedValues = expectedValues;
        this.expectedLength = expectedLength;
    }

    @Parameterized.Parameters(name = "{index}: removeDuplicates(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 2}, new int[]{1, 2}, 2},
                {new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4}, 5},
                {new int[]{}, new int[]{}, 0},
                {new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}, 5}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void removeDuplicatesSuite() {
        // When
        int resultLength = solution.removeDuplicates(values);
        int[] updatedArray = Arrays.copyOf(values, resultLength);

        // Then
        assertThat(resultLength, is(equalTo(expectedLength)));
        assertThat(updatedArray, is(equalTo(expectedValues)));
    }
}