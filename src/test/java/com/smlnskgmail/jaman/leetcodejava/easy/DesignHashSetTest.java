package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignHashSetTest {

    @Test
    public void defaultTest() {
        DesignHashSet designHashSet = new DesignHashSet();
        designHashSet.add(1);
        designHashSet.add(2);
        assertTrue(designHashSet.contains(1));
        assertFalse(designHashSet.contains(3));
        designHashSet.add(2);
        assertTrue(designHashSet.contains(2));
        designHashSet.remove(2);
        assertFalse(designHashSet.contains(2));
    }

}
