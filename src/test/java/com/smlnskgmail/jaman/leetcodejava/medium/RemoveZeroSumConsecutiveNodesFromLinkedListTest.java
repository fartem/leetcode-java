package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class RemoveZeroSumConsecutiveNodesFromLinkedListTest {

    @Test
    public void defaultTest() {
//        ListNode head = new ListNode(
//                1,
//                new ListNode(
//                        2,
//                        new ListNode(
//                                -3,
//                                new ListNode(
//                                        3,
//                                        new ListNode(1)
//                                )
//                        )
//                )
//        );
//        ListNode correct = new ListNode(
//                3,
//                new ListNode(1)
//        );
//        ListNode solution = new RemoveZeroSumConsecutiveNodesFromLinkedList(
//                head
//        ).solution();
//        while (correct != null) {
//            assertEquals(
//                    correct.val,
//                    solution.val
//            );
//            correct = correct.next;
//            solution = solution.next;
//        }

        ListNode head = new ListNode(
                0,
                new ListNode(
                        1,
                        new ListNode(-1)
                )
        );
        ListNode correct = null;
        ListNode solution = new RemoveZeroSumConsecutiveNodesFromLinkedList(
                head
        ).solution();
        assertNull(solution);
    }

}
