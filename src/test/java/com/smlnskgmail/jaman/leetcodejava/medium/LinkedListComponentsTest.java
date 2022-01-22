package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListComponentsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new LinkedListComponents(
                        new ListNode(
                                0,
                                new ListNode(
                                        1,
                                        new ListNode(
                                                2,
                                                new ListNode(3)
                                        )
                                )
                        ),
                        new int[]{0, 1, 3}
                ).solution()
        );
    }

}
