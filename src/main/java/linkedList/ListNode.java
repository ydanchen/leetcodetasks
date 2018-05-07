package linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    // ====================================================
    // Methods added to simplify debugging and unit testing
    // ====================================================

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("->", "(", ")");
        ListNode node = this;
        do {
            sj.add(Integer.toString(node.val));
            node = node.next;
        } while (node != null);
        return sj.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;

        ListNode me = this;
        ListNode that = (ListNode) o;
        while (me != null && that != null) {
            if (me.val != that.val) return false;
            me = me.next;
            that = that.next;
        }

        return true;
    }

    /**
     * Converts list of ListNodes to an array of integers
     *
     * @return array of integers
     */
    public int[] toArray() {
        List<Integer> nodes = new ArrayList<>();
        ListNode node = this;
        do {
            nodes.add(node.val);
            node = node.next;
        } while (node != null);
        return nodes.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Creates a linked list of ListNodes from an array of integers
     *
     * @param nodes array of integers
     * @return link to the head of linked list of ListNodes
     */
    public static ListNode fromInts(int... nodes) {
        if (nodes == null) return null;
        if (nodes.length == 1) return new ListNode(nodes[0]);
        ListNode tmp = new ListNode(nodes[0]);
        ListNode head = tmp;
        for (int i = 1; i < nodes.length; i++) {
            tmp.next = new ListNode(nodes[i]);
            tmp = tmp.next;
        }
        return head;
    }
}