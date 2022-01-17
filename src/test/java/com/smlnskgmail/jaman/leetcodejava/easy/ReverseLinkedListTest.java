package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void defaultTest() {
        ListNode validList =
                new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode reversedList =
                new ReverseLinkedList(
                                new ListNode(
                                        1,
                                        new ListNode(
                                                2,
                                                new ListNode(3, new ListNode(4, new ListNode(5))))))
                        .solution();
        while (validList != null) {
            assertEquals(validList.val, reversedList.val);
            validList = validList.next;
            reversedList = reversedList.next;
        }
    }
}
