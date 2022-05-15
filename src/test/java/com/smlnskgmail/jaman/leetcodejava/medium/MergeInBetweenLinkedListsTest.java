package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeInBetweenLinkedListsTest {

    @Test
    public void defaultTest() {
        ListNode list1 = ListNode.fromNumbers(0, 1, 2, 3, 4, 5);
        ListNode list2 = ListNode.fromNumbers(100000, 100001, 100002);
        ListNode correct = ListNode.fromNumbers(0, 1, 2, 100000, 100001, 100002, 5);
        ListNode solution = new MergeInBetweenLinkedLists(list1, 3, 4, list2).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
