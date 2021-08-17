package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReverseLinkedListIITest {

    @Test
    public void defaultTest() {
        ListNode head = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(
                                        4,
                                        new ListNode(5)
                                )
                        )
                )
        );
        ListNode correct = new ListNode(
                1,
                new ListNode(
                        4,
                        new ListNode(
                                3,
                                new ListNode(
                                        2,
                                        new ListNode(5)
                                )
                        )
                )
        );
        ListNode solution = new ReverseLinkedListII(
                head,
                2,
                4
        ).solution();
        while (correct != null) {
            assertEquals(
                    solution.val,
                    correct.val
            );
            correct = correct.next;
            solution = solution.next;
        }
        assertNull(solution);
    }

}
