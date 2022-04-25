package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PeekingIteratorTest {

    @Test
    public void defaultTest() {
        var peekingIterator = new PeekingIterator(
                Arrays.asList(1, 2, 3).iterator()
        );
        assertEquals(1, (int) peekingIterator.next());
        assertEquals(2, (int) peekingIterator.peek());
        assertEquals(2, (int) peekingIterator.next());
        assertEquals(3, (int) peekingIterator.next());
        assertFalse(peekingIterator.hasNext());
    }

}
