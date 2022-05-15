package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DeleteNodeInALinkedListTest {

    @Test
    public void defaultTest() {
        ListNode head = ListNode.fromNumbers(4, 5, 1, 9);
        ListNode validList = ListNode.fromNumbers(4, 1, 9);

        new DeleteNodeInALinkedList(head.next).solution();
        assertTrue(
                ListNode.areEqual(
                        head,
                        validList
                )
        );
    }

}
