package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class RemoveLinkedListElementsTest {

    @Test
    public void defaultTest() {
        ListNode validList =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result =
                new RemoveLinkedListElements(
                                new ListNode(
                                        1,
                                        new ListNode(
                                                2,
                                                new ListNode(
                                                        6,
                                                        new ListNode(
                                                                3,
                                                                new ListNode(
                                                                        4,
                                                                        new ListNode(
                                                                                5,
                                                                                new ListNode(
                                                                                        6))))))),
                                6)
                        .solution();
        while (validList != null) {
            assertEquals(validList.val, result.val);
            validList = validList.next;
            result = result.next;
        }
    }
}
