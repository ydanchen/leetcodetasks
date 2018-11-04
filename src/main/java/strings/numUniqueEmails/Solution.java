package strings.numUniqueEmails;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. Unique Email Address
 *
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually
 * receive mails?
 *
 * Example 1:
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 *
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 *
 * Note:
 * 1 <= emails[i].length <= 100
 * 1 <= emails.length <= 100
 * Each emails[i] contains exactly one '@' character.
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails)
            uniqueEmails.add(normalize(email));
        return uniqueEmails.size();
    }

    private String normalize(String email) {
        String[] tokens = email.split("@");
        String dotFree = tokens[0].replaceAll("\\.", "");
        String[] cutPlus = dotFree.split("\\+");
        return cutPlus[0] + "@" + tokens[1];
    }
}
