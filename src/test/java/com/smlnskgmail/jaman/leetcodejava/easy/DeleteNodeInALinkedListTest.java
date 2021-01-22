package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteNodeInALinkedListTest {

    @Test
    public void defaultTest() {
        ListNode head = new ListNode(
                4,
                new ListNode(
                        5,
                        new ListNode(
                                1,
                                new ListNode(9)
                        )
                )
        );
        ListNode validList = new ListNode(
                4,
                new ListNode(
                        1,
                        new ListNode(9)
                )
        );

        new DeleteNodeInALinkedList(head.next).solution();

        ListNode pointer = validList;
        while (pointer != null) {
            assertEquals(
                    pointer.val,
                    head.val
            );
            head = head.next;
            pointer = pointer.next;
        }
    }

}
