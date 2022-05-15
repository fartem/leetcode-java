package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RotateListTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(4, 5, 1, 2, 3);
        ListNode solution = new RotateList(
                ListNode.fromNumbers(1, 2, 3, 4, 5),
                2
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
