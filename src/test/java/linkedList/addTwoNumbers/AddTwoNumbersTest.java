package linkedList.addTwoNumbers;

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
public class AddTwoNumbersTest {
    private ListNode firstNumber;
    private ListNode secondNumber;
    private ListNode expected;
    private Solution solution;

    public AddTwoNumbersTest(ListNode firstNumber, ListNode secondNumber, ListNode expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameters(name = "{index}: addTwoNumbers(\"{0}\" + \"{1}\") = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {ListNode.fromInts(2, 4, 3), ListNode.fromInts(5, 6, 4), ListNode.fromInts(7, 0, 8)},
                {ListNode.fromInts(1, 1, 1), ListNode.fromInts(1, 1, 1), ListNode.fromInts(2, 2, 2)},
                {ListNode.fromInts(0), ListNode.fromInts(9, 9, 9), ListNode.fromInts(9, 9, 9)},
                {ListNode.fromInts(0), ListNode.fromInts(0), ListNode.fromInts(0)},
                {ListNode.fromInts(9, 9, 9, 9), ListNode.fromInts(9, 9, 9, 9), ListNode.fromInts(8, 9, 9, 9, 1)},
                {ListNode.fromInts(9), ListNode.fromInts(9), ListNode.fromInts(8, 1)}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void addTwoNumbersSuite() {
        assertThat(solution.addTwoNumbers(firstNumber, secondNumber).toArray(), is(equalTo(expected.toArray())));
    }
}
