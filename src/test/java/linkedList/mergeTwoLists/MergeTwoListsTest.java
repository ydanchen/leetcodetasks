package linkedList.mergeTwoLists;

import linkedList.ListNode;
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
public class MergeTwoListsTest {
    private ListNode firstList;
    private ListNode secondList;
    private ListNode expected;
    private Solution solution;

    public MergeTwoListsTest(ListNode firstList, ListNode secondList, ListNode expected) {
        this.firstList = firstList;
        this.secondList = secondList;
        this.expected = expected;
    }

    @Parameters(name = "{index}: mergeTwoLists(\"{0}\", \"{1}\") = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, null, null},
                {ListNode.fromInts(1, 2, 3), null, ListNode.fromInts(1, 2, 3)},
                {null, ListNode.fromInts(2, 3, 4), ListNode.fromInts(2, 3, 4)},
                {ListNode.fromInts(1, 2, 4), ListNode.fromInts(1, 3, 4), ListNode.fromInts(1, 1, 2, 3, 4, 4)}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void mergeTwoListsSuite() {
        ListNode result = solution.mergeTwoLists(firstList, secondList);
        assertThat(result, is(equalTo(expected)));
    }
}