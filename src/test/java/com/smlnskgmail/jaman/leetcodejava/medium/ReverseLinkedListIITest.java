package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReverseLinkedListIITest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 4, 3, 2, 5);
        ListNode solution = new ReverseLinkedListII(
                ListNode.fromNumbers(1, 2, 3, 4, 5),
                2,
                4
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
