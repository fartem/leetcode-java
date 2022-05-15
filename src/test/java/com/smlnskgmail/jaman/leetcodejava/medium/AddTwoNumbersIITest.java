package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddTwoNumbersIITest {

    @Test
    public void defaultTest() {
        ListNode l1 = ListNode.fromNumbers(7, 2, 4, 3);
        ListNode l2 = ListNode.fromNumbers(5, 6, 4);
        ListNode correct = ListNode.fromNumbers(7, 8, 0, 7);
        ListNode solution = new AddTwoNumbersII(l1, l2).solution();
        assertTrue(ListNode.areEqual(solution, correct));
    }

}
