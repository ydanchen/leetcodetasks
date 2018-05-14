package linkedList.deleteDuplicates;

import linkedList.ListNode;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class DeleteDuplicatesTest {
    private ListNode inputValues;
    private ListNode expected;
    private Solution solution;

    public DeleteDuplicatesTest(ListNode inputValues, ListNode expected) {
        this.inputValues = inputValues;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: deleteDuplicates(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {ListNode.fromInts(1, 1, 2), ListNode.fromInts(1, 2)},
                {ListNode.fromInts(1, 1, 2, 3, 3), ListNode.fromInts(1, 2, 3)},
                {ListNode.fromInts(1, 1, 5, 5, 5, 6, 7, 8, 10, 10), ListNode.fromInts(1, 5, 6, 7, 8, 10)},
                {ListNode.fromInts(1, 2, 3, 4, 5), ListNode.fromInts(1, 2, 3, 4, 5)},
                {null, null}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void deleteDuplicatesSuite() {
        ListNode result = solution.deleteDuplicates(inputValues);
        assertThat(result, is(equalTo(expected)));
    }
}