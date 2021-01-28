package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortListTest {

    @Test
    public void defaultTest() {
        ListNode validList = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(4)
                        )
                )
        );
        ListNode sortedList = new SortList(
                new ListNode(
                        4,
                        new ListNode(
                                2,
                                new ListNode(
                                        1,
                                        new ListNode(3)
                                )
                        )
                )
        ).solution();
        while (validList != null) {
            assertEquals(
                    validList.val,
                    sortedList.val
            );
            validList = validList.next;
            sortedList = sortedList.next;
        }
    }

}
