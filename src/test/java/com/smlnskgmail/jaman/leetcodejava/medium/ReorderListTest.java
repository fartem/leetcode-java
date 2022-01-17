package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class ReorderListTest {

    @Test
    public void defaultTest() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode correct = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(3))));
        new ReorderList(input).solution();
        while (correct != null) {
            assertEquals(input.val, correct.val);
            correct = correct.next;
            input = input.next;
        }
        assertNull(input);
    }
}
