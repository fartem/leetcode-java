package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveNthNodeFromEndOfListTest {

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
        int n = 2;
        ListNode correct = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(5)
                        )
                )
        );
        ListNode solution = new RemoveNthNodeFromEndOfList(
                head,
                n
        ).solution();
        while (correct != null) {
            assertEquals(
                    correct.val,
                    correct.val
            );
            correct = correct.next;
            solution = solution.next;
        }
    }

}
