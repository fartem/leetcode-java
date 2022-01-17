package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ImplementStackUsingQueuesTest {

    @Test
    public void defaultTest() {
        ImplementStackUsingQueues implementStackUsingQueues = new ImplementStackUsingQueues();
        implementStackUsingQueues.push(1);
        implementStackUsingQueues.push(2);
        assertEquals(2, implementStackUsingQueues.top());
        assertEquals(2, implementStackUsingQueues.pop());
        assertFalse(implementStackUsingQueues.empty());
    }
}
