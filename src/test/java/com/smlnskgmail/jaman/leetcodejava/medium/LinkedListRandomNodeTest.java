package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class LinkedListRandomNodeTest {

    @Test
    public void defaultTest() {
        ListNode head = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(3)
                )
        );
        LinkedListRandomNode linkedListRandomNode = new LinkedListRandomNode(head);
        assertNotEquals(
                -1,
                linkedListRandomNode.solution()
        );
        assertNotEquals(
                -1,
                linkedListRandomNode.solution()
        );
        assertNotEquals(
                -1,
                linkedListRandomNode.solution()
        );
    }

}
