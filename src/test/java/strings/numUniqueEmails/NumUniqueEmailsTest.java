package strings.numUniqueEmails;

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
public class NumUniqueEmailsTest {
    private String[] emails;
    private int expected;
    private Solution solution;

    public NumUniqueEmailsTest(String[] emails, int expected) {
        this.emails = emails;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: numUniqueEmailsTest(\"{0}\") = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}, 2},
                {new String[]{"john.dough@test.com", "johndough@test.com", "john.dough+2@test.com"}, 1}
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void numUniqueEmailsSuite() {
        int result = solution.numUniqueEmails(emails);
        assertThat(result, is(equalTo(expected)));
    }
}