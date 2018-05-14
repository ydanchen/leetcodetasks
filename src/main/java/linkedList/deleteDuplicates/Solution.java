package linkedList.deleteDuplicates;

import linkedList.ListNode;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode previous = head;
        while (current != null) {
            if (current.next != null && previous.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
            previous = current;
        }
        return head;
    }
}
