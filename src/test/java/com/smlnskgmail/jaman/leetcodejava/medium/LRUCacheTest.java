package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {

    @Test
    public void defaultTest() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        assertEquals(
                1,
                lRUCache.get(1)
        );

        lRUCache.put(3, 3);
        assertEquals(
                -1,
                lRUCache.get(2)
        );

        lRUCache.put(4, 4);
        assertEquals(
                -1,
                lRUCache.get(1)
        );
        assertEquals(
                3,
                lRUCache.get(3)
        );
        assertEquals(
                4,
                lRUCache.get(4)
        );
    }

}
