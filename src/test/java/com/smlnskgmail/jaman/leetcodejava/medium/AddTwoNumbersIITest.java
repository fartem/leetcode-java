package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AddTwoNumbersIITest {

    @Test
    public void defaultTest() {
        ListNode l1 = new ListNode(
                7,
                new ListNode(
                        2,
                        new ListNode(
                                4,
                                new ListNode(3)
                        )
                )
        );
        ListNode l2 = new ListNode(
                5,
                new ListNode(
                        6,
                        new ListNode(4)
                )
        );
        ListNode correct = new ListNode(
                7,
                new ListNode(
                        8,
                        new ListNode(
                                0,
                                new ListNode(7)
                        )
                )
        );
        ListNode solution = new AddTwoNumbersII(l1, l2).solution();
        while (correct != null) {
            assertEquals(
                    solution.val,
                    correct.val
            );
            solution = solution.next;
            correct = correct.next;
        }
        assertNull(solution);
    }

}
