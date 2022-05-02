package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapSumPairsTest {

    @Test
    public void defaultTest() {
        var mapSumPairs = new MapSumPairs();
        mapSumPairs.insert("apple", 3);
        assertEquals(3, mapSumPairs.sum("ap"));

        mapSumPairs.insert("app", 2);
        mapSumPairs.sum("ap");
        assertEquals(5, mapSumPairs.sum("ap"));
    }

}
