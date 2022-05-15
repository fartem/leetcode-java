package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void defaultTest() {
        ListNode intersection = ListNode.fromNumbers(8, 4, 5);
        ListNode solution = new IntersectionOfTwoLinkedLists(
                new ListNode(
                        4,
                        new ListNode(
                                1,
                                intersection
                        )
                ),
                new ListNode(
                        5,
                        new ListNode(
                                6,
                                new ListNode(
                                        1,
                                        intersection
                                )
                        )
                )
        ).solution();
        assertTrue(ListNode.areEqual(intersection, solution));
    }

}
