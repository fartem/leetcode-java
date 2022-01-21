package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteTheMiddleNodeOfALinkedListTest {

    @Test
    public void defaultTest() {
        ListNode correct = new ListNode(
                1,
                new ListNode(
                        3,
                        new ListNode(
                                4,
                                new ListNode(
                                        1,
                                        new ListNode(
                                                2,
                                                new ListNode(6)
                                        )
                                )
                        )
                )
        );
        ListNode solution = new DeleteTheMiddleNodeOfALinkedList(
                new ListNode(
                        1,
                        new ListNode(
                                3,
                                new ListNode(
                                        4,
                                        new ListNode(
                                                7,
                                                new ListNode(
                                                        1,
                                                        new ListNode(
                                                                2,
                                                                new ListNode(6)
                                                        )
                                                )
                                        )
                                )
                        )
                )
        ).solution();
        while (correct != null) {
            assertEquals(
                    correct.val,
                    solution.val
            );
            correct = correct.next;
            solution = solution.next;
        }
    }

}
