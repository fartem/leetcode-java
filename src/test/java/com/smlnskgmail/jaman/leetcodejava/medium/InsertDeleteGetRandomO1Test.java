package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertDeleteGetRandomO1Test {

    @Test
    public void defaultTest() {
        var insertDeleteGetRandomO1 = new InsertDeleteGetRandomO1();
        assertTrue(insertDeleteGetRandomO1.insert(1));
        assertFalse(insertDeleteGetRandomO1.remove(2));
        assertTrue(insertDeleteGetRandomO1.insert(2));

        int random = insertDeleteGetRandomO1.getRandom();
        assertTrue(random == 1 || random == 2);
        assertTrue(insertDeleteGetRandomO1.remove(1));
        assertFalse(insertDeleteGetRandomO1.insert(2));
        assertEquals(2, insertDeleteGetRandomO1.getRandom());
    }

}
