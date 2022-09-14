package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListCycleIITest {

    @Test
    public void defaultTest() {
        ListNode loopStart = new ListNode(2);
        ListNode loopMiddle = new ListNode(0);
        loopStart.next = loopMiddle;
        loopMiddle.next = new ListNode(-4, loopStart);
        ListNode head = new ListNode(3, loopStart);
        assertEquals(loopStart, new LinkedListCycleII(head).solution());
    }

}
