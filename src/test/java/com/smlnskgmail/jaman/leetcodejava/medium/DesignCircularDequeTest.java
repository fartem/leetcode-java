package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesignCircularDequeTest {

    @Test
    public void defaultTest() {
        DesignCircularDeque designCircularDeque = new DesignCircularDeque(3);
        assertTrue(designCircularDeque.insertLast(1));
        assertTrue(designCircularDeque.insertLast(2));
        assertTrue(designCircularDeque.insertFront(3));
        assertFalse(designCircularDeque.insertFront(4));
        assertEquals(2, designCircularDeque.getRear());
        assertTrue(designCircularDeque.isFull());
        assertTrue(designCircularDeque.deleteLast());
        assertTrue(designCircularDeque.insertFront(4));
        assertEquals(4, designCircularDeque.getFront());
    }

}
