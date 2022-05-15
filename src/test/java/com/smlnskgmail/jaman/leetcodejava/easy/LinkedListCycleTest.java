package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void defaultTest() {
        ListNode[] nodes = new ListNode[4];
        nodes[0] = new ListNode(3);
        nodes[1] = new ListNode(2);
        nodes[0].next = nodes[1];
        nodes[2] = new ListNode(0);
        nodes[1].next = nodes[2];
        nodes[3] = new ListNode(-4);
        nodes[2].next = nodes[3];
        nodes[3].next = nodes[1];
        assertTrue(new LinkedListCycle(nodes[0]).solution());
    }

}
