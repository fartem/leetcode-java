package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortListTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 2, 3, 4);
        ListNode solution = new SortList(ListNode.fromNumbers(4, 2, 1, 3)).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
