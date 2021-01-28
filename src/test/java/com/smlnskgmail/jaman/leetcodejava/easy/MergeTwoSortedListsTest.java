package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void defaultTest() {
        ListNode validList = new ListNode(
                1,
                new ListNode(
                        1,
                        new ListNode(
                                2,
                                new ListNode(
                                        3,
                                        new ListNode(4)
                                )
                        )
                )
        );
        ListNode mergedList = new MergeTwoSortedLists(
                new ListNode(
                        1,
                        new ListNode(
                                2,
                                new ListNode(4)
                        )
                ),
                new ListNode(
                        1,
                        new ListNode(
                                3,
                                new ListNode(4)
                        )
                )
        ).solution();
        while (validList != null) {
            assertEquals(
                    validList.val,
                    mergedList.val
            );
            validList = validList.next;
            mergedList = mergedList.next;
        }
    }

}
