package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void defaultTest() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode correct = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode solution = new AddTwoNumbers(l1, l2).solution();
        while (correct != null) {
            assertEquals(correct.val, solution.val);
            correct = correct.next;
            solution = solution.next;
        }
    }
}
