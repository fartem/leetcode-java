package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesignCircularQueueTest {

    @Test
    public void defaultTest() {
        DesignCircularQueue designCircularQueue = new DesignCircularQueue(3);
        assertTrue(designCircularQueue.enQueue(1));
        assertTrue(designCircularQueue.enQueue(2));
        assertTrue(designCircularQueue.enQueue(3));
        assertFalse(designCircularQueue.enQueue(4));
        assertEquals(
                3,
                designCircularQueue.Rear()
        );
        assertTrue(designCircularQueue.isFull());
        assertTrue(designCircularQueue.deQueue());
        assertTrue(designCircularQueue.enQueue(4));
        assertEquals(
                4,
                designCircularQueue.Rear()
        );
    }

}
