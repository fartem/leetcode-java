package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveLinkedListElementsTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 2, 3, 4, 5);
        ListNode solution = new RemoveLinkedListElements(
                ListNode.fromNumbers(1, 2, 6, 3, 4, 5, 6),
                6
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
