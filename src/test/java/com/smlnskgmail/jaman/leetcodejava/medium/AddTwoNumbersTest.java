package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddTwoNumbersTest {

    @Test
    public void defaultTest() {
        ListNode l1 = ListNode.fromNumbers(2, 4, 3);
        ListNode l2 = ListNode.fromNumbers(5, 6, 4);
        ListNode correct = ListNode.fromNumbers(7, 0, 8);
        ListNode solution = new AddTwoNumbers(l1, l2).solution();
        assertTrue(
                ListNode.areEqual(
                        correct,
                        solution
                )
        );
    }

}
