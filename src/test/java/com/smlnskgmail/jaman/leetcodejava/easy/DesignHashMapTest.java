package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignHashMapTest {

    @Test
    public void defaultTest() {
        var designHashMap = new DesignHashMap();
        designHashMap.put(1, 1);
        designHashMap.put(2, 2);

        assertEquals(1, designHashMap.get(1));
        assertEquals(-1, designHashMap.get(3));

        designHashMap.put(2, 1);
        assertEquals(1, designHashMap.get(2));

        designHashMap.remove(2);
        assertEquals(-1, designHashMap.get(2));
    }

}
