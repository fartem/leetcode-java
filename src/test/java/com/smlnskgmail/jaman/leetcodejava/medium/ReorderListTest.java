package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReorderListTest {

    @Test
    public void defaultTest() {
        ListNode input = ListNode.fromNumbers(1, 2, 3, 4);
        ListNode correct = ListNode.fromNumbers(1, 4, 2, 3);
        new ReorderList(input).solution();
        assertTrue(ListNode.areEqual(input, correct));
    }

}
