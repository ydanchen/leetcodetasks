package linkedList.middleNode;

import linkedList.ListNode;
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
public class MiddleNodeTest {
    private ListNode list;
    private ListNode expected;
    private Solution solution;

    public MiddleNodeTest(ListNode list, ListNode expected) {
        this.list = list;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: middleNode(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {ListNode.fromInts(1, 2, 3, 4, 5), ListNode.fromInts(3, 4, 5)},
                {ListNode.fromInts(1, 2, 3, 4, 5, 6), ListNode.fromInts(4, 5, 6)},
                {ListNode.fromInts(2, 4, 6, 8, 10, 12, 16), ListNode.fromInts(8, 10, 12, 16)}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void middleNodeSuite() {
        ListNode result = solution.middleNode(list);
        assertThat(result, is(equalTo(expected)));
    }
}