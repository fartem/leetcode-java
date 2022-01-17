package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void defaultTest() {
        ListNode intersection = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode result =
                new IntersectionOfTwoLinkedLists(
                                new ListNode(4, new ListNode(1, intersection)),
                                new ListNode(5, new ListNode(6, new ListNode(1, intersection))))
                        .solution();
        while (intersection != null) {
            assertEquals(intersection, result);
            intersection = intersection.next;
            result = result.next;
        }
    }
}
