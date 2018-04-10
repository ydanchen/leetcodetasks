package linkedList.addTwoNumbers;

import linkedList.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp, sum = new ListNode(0);
        boolean firstpass = true;
        int n1 = 0;
        int n2 = 0;
        int transfer = 0;
        tmp = sum;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            } else n1 = 0;

            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            } else n2 = 0;

            if (n1 + n2 + transfer < 10) {
                if (firstpass) {
                    tmp.val = n1 + n2;
                    firstpass = false;
                } else {
                    tmp.next = new ListNode(n1 + n2 + transfer);
                    tmp = tmp.next;
                    transfer = 0;
                }
            } else {
                if (firstpass) {
                    tmp.val = n1 + n2 - 10;
                    firstpass = false;
                    transfer = 1;
                } else {
                    tmp.next = new ListNode(n1 + n2 + transfer - 10);
                    tmp = tmp.next;
                    transfer = 1;
                }
            }
        }
        if (transfer == 1)
            tmp.next = new ListNode(1);
        return sum;
    }
}