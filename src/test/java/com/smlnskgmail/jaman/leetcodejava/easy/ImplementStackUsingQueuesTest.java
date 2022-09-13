package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
