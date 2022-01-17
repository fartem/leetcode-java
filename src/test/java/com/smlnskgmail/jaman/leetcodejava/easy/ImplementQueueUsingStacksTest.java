package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ImplementQueueUsingStacksTest {

    @Test
    public void defaultTest() {
        ImplementQueueUsingStacks implementQueueUsingStacks = new ImplementQueueUsingStacks();
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        assertEquals(1, implementQueueUsingStacks.peek());
        assertEquals(1, implementQueueUsingStacks.pop());
        assertFalse(implementQueueUsingStacks.empty());
    }
}
