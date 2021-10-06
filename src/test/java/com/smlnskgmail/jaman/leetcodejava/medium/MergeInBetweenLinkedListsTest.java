package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeInBetweenLinkedListsTest {

    @Test
    public void defaultTest() {
        ListNode list1 = new ListNode(
                0,
                new ListNode(
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
                )
        );
        ListNode list2 = new ListNode(
                100000,
                new ListNode(
                        100001,
                        new ListNode(100002)
                )
        );
        ListNode correct = new ListNode(
                0,
                new ListNode(
                        1,
                        new ListNode(
                                2,
                                new ListNode(
                                        100000,
                                        new ListNode(
                                                100001,
                                                new ListNode(
                                                        100002,
                                                        new ListNode(5)
                                                )
                                        )
                                )
                        )
                )
        );
        ListNode solution = new MergeInBetweenLinkedLists(
                list1,
                3,
                4,
                list2
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
